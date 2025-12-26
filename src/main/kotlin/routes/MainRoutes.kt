package temp.dev.routes

import io.ktor.server.application.Application
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import io.ktor.server.plugins.swagger.*

fun Application.configureRoutes() {
    routing {
        route("/api/v1"){
            swaggerUI(path = "swagger", swaggerFile = "openapi/documentation.yaml"){
                version = "4.15.5"
            }
            userRoutes()
        }
    }
}