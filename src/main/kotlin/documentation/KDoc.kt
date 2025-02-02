package documentation
/**
 * @param name: This tag is used to explain the purpose of a function's or a type parameter's value. The parameter's name can optionally be enclosed in brackets for clarity, like `@param[name]`.
@return: This tag is used to describe what a function returns.
@constructor: This tag documents the primary constructor of a class.
@receiver: This tag is used to document the receiver of an extension function.
@property name: This tag is used to document a class property with the given name. It's particularly useful for properties declared in the primary constructor where a direct doc comment might be awkward.
@throws class, @exception class: These tags are used to document exceptions that a method might throw.
@sample identifier: This tag embeds a function as an example in the current element's documentation.
@see identifier: This tag adds a link to the specified class or method in the "See also" section of the documentation.
@author: This tag specifies the author of the documented element.
@since: This tag specifies the version in which the documented element was introduced.
@suppress: This tag excludes the element from the generated documentation. It can be used for elements not part of the official API of a module but still need to be externally visible.
@Deprecated: This tag is used to indicated this method is deprecated.
 */
/**
 * This is a KDoc comment for the Person class. It describes the class and its behavior.
 *
 * @property name The name of the person.
 * @property age The age of the person.
 * @constructor Creates a new instance of the Person class.
 * @author John Doe
 * @since 1.0
 */
class Person(val name: String, var age: Int) {
    /**
     * A method to celebrate a person's birthday. It increases the person's age by 1.
     *
     * @return A birthday message.
     * @throws Exception if the person's age is negative.
     * @sample celebrateBirthdaySample
     */
    fun celebrateBirthday(): String {
        if (age < 0) {
            throw Exception("Age cannot be negative")
        }
        age++
        return "Happy birthday $name, you are now $age years old!"
    }

    /**
     * A method to introduce the person.
     *
     * @return An introduction message.
     * @see Person.name
     * @see Person.age
     */
    fun introduce(): String {
        return "Hello, my name is $name and I am $age years old."
    }
}

/**
 * A sample usage of the celebrateBirthday method.
 *
 * @suppress
 */
fun celebrateBirthdaySample() {
    val john = Person("John", 20)
    println(john.celebrateBirthday())
}

/**
 * Use the method [celebrateBirthday] for this purpose.
 */
 /**
 * Use [this method][celebrateBirthday] for this purpose.
 */
 /**
 * Use [Person.celebrateBirthday] to celebrate the person's birthday.
 */
 /**
 * This is a [Person] class. It represents a person with a [name] and an [age].
 *
 * @property name The name of the person.
 * @property age The age of the person.
 * @constructor Creates a new instance of the [Person] class.
 * @author John Doe
 * @since 1.0
 */
class PersonDoc(val name: String, var age: Int) {
    /**
     * A method to celebrate a person's birthday. It increases the person's [age] by 1.
     *
     * @return A birthday message.
     * @throws Exception if the person's age is negative.
     * @sample celebrateBirthdaySample
     * @see age
     */
    fun celebrateBirthday(): String {
        if (age < 0) {
            throw Exception("Age cannot be negative")
        }
        age++
        return "Happy birthday $name, you are now $age years old!"
    }

    /**
     * A method to introduce the person.
     *
     * @return An introduction message.
     * @see name
     * @see age
     */
    fun introduce(): String {
        return "Hello, my name is $name and I am $age years old."
    }
}

/**
 * A sample usage of the [Person.celebrateBirthday] method.
 *
 * @suppress
 */
fun celebrateBirthdaySampleDoc() {
    val john = Person("John", 20)
    println(john.celebrateBirthday())
}