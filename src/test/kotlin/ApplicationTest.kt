import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import org.junit.Test
import temp.dev.module
import kotlin.test.assertEquals


class ApplicationTest {
    @Test
    fun rootWorks() = testApplication {
        application{
            module()
        }

        val response = client.get("api/v1/user")

        assertEquals(HttpStatusCode.OK, response.status)
    }
}