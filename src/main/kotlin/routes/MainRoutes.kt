package routes

import io.ktor.server.application.Application
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import temp.dev.routes.userRoutes

fun Application.configureRoutes() {
    routing {
        route("/api/v1"){
            userRoutes()
        }
    }
}