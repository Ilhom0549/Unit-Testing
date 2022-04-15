package uz.ilkhomkhuja.unittestingexample.utils

object RegistrationUtil {
    private val users = listOf("Ilhom", "Laziz")
    fun registrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in users) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 4) {
            return false
        }
        return true
    }
}