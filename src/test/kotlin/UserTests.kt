import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.server.testing.testApplication
import org.junit.Test
import requests.UserCreateRequest
import temp.dev.module

class UserTests {
    @Test
    fun testPostUserCreate() = testApplication {
        application{
            module()
        }


        val response = client.post("/api/v1/user") {
            contentType(ContentType.Application.Json)
            setBody(UserCreateRequest(
                "Marionil Julio",
                "Marioguzman140@gmail.com",
                "123456789"))
        }

        println(response.bodyAsText())
    }

}