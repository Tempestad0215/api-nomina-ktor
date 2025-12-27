package tables

import enums.ModelStatusEnum
import org.jetbrains.exposed.dao.id.IntIdTable


const val MAX_VARCHAR_LENGTH = 128

object UserTable: IntIdTable("users") {
    val name = varchar("name", MAX_VARCHAR_LENGTH)
    val email = varchar("email", MAX_VARCHAR_LENGTH).uniqueIndex()
    val password = varchar("password", 255)
    val modelStatus = enumerationByName("model_status", 20, ModelStatusEnum::class).default(ModelStatusEnum.Active)
}