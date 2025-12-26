package temp.dev

import io.ktor.server.application.*
import temp.dev.routes.configureRoutes

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRoutes()
}
