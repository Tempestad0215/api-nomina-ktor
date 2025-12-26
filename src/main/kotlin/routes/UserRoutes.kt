package temp.dev.routes

import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.userRoutes() {
    route("/user"){
        get{
            call.respondText("Hello World!")
        }
    }
}