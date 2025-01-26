package json

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.*
import java.io.File

@Serializable
data class UserDto(
    val id: Long,
    @SerialName("first_name")
    val firstName: String,
    @SerialName("last_name")
    val lastName: String,
    val avatar: String? = null,
    val email: String? = null,
    @SerialName("created_at")
    val createdAt: String? = null,
)

@Serializable
class GetAllDto(
    val page: Int,
    @SerialName("per_page")
    val perPage: Int = 0,
    val total: Int? = 0,
    @SerialName("total_pages")
    val totalPages: Int = 0,
    val data: List<UserDto> = listOf(),
    val support: SupportDto,
)

@Serializable
class GetByIdDto(
    val data: UserDto,
    val support: SupportDto,
)


@Serializable
class SupportDto(
    val url: String,
    val text: String,
)

@Serializable
class TokenDto(
    val token: String
)

@Serializable
class UploadDto(
    val url: String,
)

@Serializable
data class LoginDto(
    var email: String,
    var password: String
)

interface RetroFitRest {
    @GET("api/users")
    suspend fun getAll(@Query("page") page: Int = 0, @Query("per_page") perPage: Int = 0): Response<GetAllDto>

    @GET("api/users/{id}")
    suspend fun getById(@Path("id") id: Long): Response<GetByIdDto>

    @POST("api/users")
    suspend fun create(@Body user: UserDto): Response<UserDto>

    @PUT("api/users/{id}")
    suspend fun update(@Path("id") id: Long, @Body user: UserDto): Response<UserDto>

    @PATCH("api/users/{id}")
    suspend fun upgrade(@Path("id") id: Long, @Body user: UserDto): Response<UserDto>

    @DELETE("api/users/{id}")
    suspend fun delete(@Path("id") id: Long): Response<Void>

    @POST("api/login")
    suspend fun login(@Body user: LoginDto): Response<TokenDto>

    @GET("api/users")
    suspend fun getAllWithToken(
        @Header("Authorization") token: String,
        @Query("page") page: Int = 0,
        @Query("per_page") perPage: Int = 0
    ): Response<GetAllDto>

    @Multipart
    @POST("api/upload")
    suspend fun uploadFile(
        @Part filePart: MultipartBody.Part,
        @Part("description") description: RequestBody
    ): Response<UploadDto>
}


object ApiRest {
    private const val API_URL = "https://reqres.in/"
    private val contentType = MediaType.get("application/json")

    val client = Retrofit.Builder()
        .baseUrl(API_URL) // API base URL
        .addConverterFactory(Json.asConverterFactory(contentType)) // Use Kotlinx serialization converter
        .build() // Create Retrofit instance
        .create(RetroFitRest::class.java) // Create API interface
}

class RetrofitRepository {
    suspend fun findAll(page: Int, perPage: Int): List<UserDto> {
        ApiRest.client.getAll(page, perPage).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!.data
            } else {
                throw RestException("Error ${response.code()} to get users  ${response.errorBody()}")
            }
        }
    }

    suspend fun findAllWithToken(token: String, page: Int, perPage: Int): List<UserDto> {
        ApiRest.client.getAllWithToken(token, page, perPage).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!.data
            } else {
                throw RestException("Error ${response.code()} to get users ${response.errorBody()}")
            }
        }

    }

    suspend fun findById(id: Long): UserDto {
        ApiRest.client.getById(id).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!.data
            } else {
                throw RestException("Error ${response.code()} to get user by id ${response.errorBody()}")
            }
        }
    }

    suspend fun save(entity: UserDto): UserDto {
        ApiRest.client.create(entity).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!
            } else {
                throw RestException("Error ${response.code()} to create user ${response.errorBody()}")
            }
        }
    }

    suspend fun update(entity: UserDto): UserDto {
        ApiRest.client.update(entity.id, entity).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!
            } else {
                throw RestException("Error ${response.code()} to update user ${response.errorBody()}")
            }
        }
    }

    suspend fun delete(entity: UserDto): UserDto {
        ApiRest.client.delete(entity.id).let { response ->
            if (response.isSuccessful) {
                return entity
            } else {
                throw RestException("Error ${response.code()} to delete user ${response.errorBody()}")
            }
        }
    }

    suspend fun login(login: LoginDto): String {
        ApiRest.client.login(login).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!.token
            } else {
                throw RestException("Error ${response.code()} to login ${response.errorBody()}")
            }
        }
    }

    suspend fun uploadFile(file: File, description: String): String {
        val filePart = MultipartBody.Part.createFormData(
            "file",
            file.name,
            RequestBody.create(MultipartBody.FORM, file)
        )
        val descriptionPart = RequestBody.create(MultipartBody.FORM, description)

        ApiRest.client.uploadFile(filePart, descriptionPart).let { response ->
            if (response.isSuccessful && response.body() != null) {
                return response.body()!!.url
            } else {
                throw RestException("Error ${response.code()} to upload file ${response.errorBody()}")
            }
        }
    }
}

class RestException(s: String) : Throwable() {

}
