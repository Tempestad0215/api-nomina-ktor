import io.ktor.serialization.kotlinx.json.json
import io.ktor.serialization.kotlinx.xml.xml
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.serialization.json.*
import nl.adaptivity.xmlutil.serialization.XML


fun Application.configureNegotiation() {
    install(ContentNegotiation) {
        json(
            Json{
                prettyPrint = true
                isLenient = true
                encodeDefaults = true
            }
        )
        xml(
            XML{
                autoPolymorphic = true
            }
        )
    }
}