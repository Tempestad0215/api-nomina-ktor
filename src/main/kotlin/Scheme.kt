import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.count
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import tables.UserTable

fun createScheme(){
    transaction {
        SchemaUtils.createMissingTablesAndColumns(UserTable)


//        val userID = UserTable.insert {
//            it[name] = "Marionil Julio Guzman"
//            it[email] = "marioguzman140@gmail.com"
//            it[password] = "12345678"
//        } get UserTable.id
        UserTable.select(UserTable.id, UserTable.name, UserTable.email)
            .where{
                UserTable.name like "mari%"
            }.
            forEach {
            println("${it[UserTable.id]} ${it[UserTable.name]}: ${it[UserTable.email]}")
        }


        println("Se esta creando la base de datos de todas las cosas")
    }
}