package temp.dev.routes

import io.ktor.http.ContentType
import io.ktor.server.request.receive
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import requests.UserCreateRequest

fun Route.userRoutes() {
    route("/user"){
        get{
            call.respondText(
                contentType = ContentType.parse("text/html; charset=utf-8"),
                text = """
                    <h3>TODO:</h3>
                <ol>
                    <li>A table of all the tasks</li>
                    <li>A form to submit new tasks</li>
                </ol>
                """.trimIndent()
            )
        }
        post{
            val user = call.receive<UserCreateRequest>()


        }
    }
}