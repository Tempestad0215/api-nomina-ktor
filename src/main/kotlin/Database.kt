import io.ktor.server.application.Application
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases(){

    Database.connect(
        "jdbc:mysql://localhost:3306/pos_sales",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "Mg829697+"
    )

}