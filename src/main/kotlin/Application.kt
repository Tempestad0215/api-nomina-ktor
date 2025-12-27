package temp.dev

import configureDatabases
import createScheme
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.SchemaUtils.createDatabase
import routes.configureRoutes

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureDatabases()
    configureCors()
    createScheme()
//    configureRateLimit()
    configureRoutes ()
}
