package requests

import kotlinx.serialization.Serializable

@Serializable
data class UserCreateRequest(val name :String, val email:String, val password:String)
