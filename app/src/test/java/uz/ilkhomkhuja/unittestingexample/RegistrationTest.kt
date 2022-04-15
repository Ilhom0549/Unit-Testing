package uz.ilkhomkhuja.unittestingexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import uz.ilkhomkhuja.unittestingexample.utils.RegistrationUtil

class RegistrationTest {

    @Test
    fun emptyUsernameReturnFalse() {
        val result = RegistrationUtil.registrationInput(
            "", "12345", "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameAndCorrectlyRepeatedPasswordReturnsTrue() {
        val result = RegistrationUtil.registrationInput(
            "Aziz", "12345", "12345"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun existingUsernameReturnsFalse() {
        val result = RegistrationUtil.registrationInput(
            "Ilhom", "123", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyPasswordReturnsFalse() {
        val result = RegistrationUtil.registrationInput(
            "Ilhom", "", ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun passwordNotRepeatedCorrectlyReturnsFalse() {
        val result = RegistrationUtil.registrationInput(
            "Ilhom", "123456", "54312"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun passwordLengthLessThan4ReturnsFalse() {
        val result = RegistrationUtil.registrationInput(
            "Ilhom", "123", "123"
        )
        assertThat(result).isFalse()
    }
}