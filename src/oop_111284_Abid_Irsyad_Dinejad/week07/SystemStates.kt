package oop_111284_Abid_Irsyad_Dinejad.week07

enum class Appstate {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Failure(val message: String) : ApiResponse()
    object Loading : ApiResponse()
    }



