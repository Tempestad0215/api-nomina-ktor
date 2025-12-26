package temp.dev

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.ratelimit.*
import temp.dev.routes.configureRoutes

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(CORS)
    {
        anyHost()
        allowHeader(HttpHeaders.ContentType)
    }
    install(RateLimit)
    configureRoutes ()
}
