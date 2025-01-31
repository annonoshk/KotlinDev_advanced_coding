package db.mongoDB

import com.mongodb.client.model.Filters.eq
import com.mongodb.kotlin.client.coroutine.MongoClient
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.toList
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class Person(@BsonId val id: ObjectId, val name: String, val age: Int)

suspend fun main() {
    // Connect to MongoDB
    val MONGO_DB_URL = "mongodb://crevolikadb.com"
    val mongoClient = MongoClient.create(MONGO_DB_URL)
    val database = mongoClient.getDatabase("persons")
    // Get a collection of documents of type Person
    val collection = database.getCollection<Person>("persons")
    //...
    // Close connection
    //mongoClient.close()

    val newPerson = Person(ObjectId(), "Joe Doe", 36)
    collection.insertOne(newPerson).also {
       println("Person added with id: ${it.insertedId}")
    }
    // Person added with id: BsonObjectId{value=64e4e2158c887a05f4ea7b5b}

    // Create many
    val morePersons = listOf(
       Person(ObjectId(), "Jane Doe", 25),
       Person(ObjectId(), "John Doe", 27)
    )
    collection.insertMany(morePersons).also {
       println("Persons added with ids: ${it.insertedIds}")
    }
    // Persons added with ids: {0=BsonObjectId{value=64e4e2168c887a05f4ea7b5c},
    // 1=BsonObjectId{value=64e4e2168c887a05f4ea7b5d}}
    // Get All
    val persons = collection.find().toList()
    println("Persons count: ${persons.size}")
    println("Persons list")
    persons.forEach {
        println("${it.name} - ${it.age}")
    }
    // Persons list
    // Joe Doe - 36
    // Jane Doe - 25
    // John Doe - 27

    // Find one by name
    val person = collection.find(eq("name", "Jane Doe")).firstOrNull()?.let {
        println("Person found: ${it.name} - ${it.age}")
    } ?: println("Person not found")
    // Person found: Jane Doe - 25
}

