package temp.dev

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.ratelimit.*

fun Application.configureRateLimit() {
    install(RateLimit)
}