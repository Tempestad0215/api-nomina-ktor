package temp.dev.routes

import io.ktor.server.application.Application
import io.ktor.server.routing.route
import io.ktor.server.routing.routing

fun Application.configureRoutes() {
    routing {
        route("/api/v1"){
            userRoutes()
        }
    }
}