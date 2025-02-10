package test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

enum class PasswordStrength {
    STRONG, MEDIUM, WEAK
}

class PasswordUtils {
    fun getStrength(password: String): PasswordStrength {
        val length = ".{8,}".toRegex() // at least 8 chars long
        val lowercase = "(?=.*[a-z])".toRegex() // at least one lowercase char
        val uppercase = "(?=.*[A-Z])".toRegex() // at least one uppercase char
        val digit = "(?=.*\\d)".toRegex() // at least one digit
        val special = "(?=.*[ !@#$%^&*])".toRegex() // at least one of these special chars

        val strongRegex = Regex(lowercase.pattern + uppercase.pattern + digit.pattern + special.pattern + length.pattern)
        val mediumRegex1 = Regex(lowercase.pattern + digit.pattern + length.pattern)
        val mediumRegex2 = Regex(uppercase.pattern + digit.pattern + length.pattern)


        return when {
            password.matches(strongRegex) -> PasswordStrength.STRONG
            password.matches(mediumRegex1) -> PasswordStrength.MEDIUM
            password.matches(mediumRegex2) -> PasswordStrength.MEDIUM
            else -> PasswordStrength.WEAK
        }
    }
}
    


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SnippetTests {

    val passwordUtils = PasswordUtils()

    @ParameterizedTest
    @MethodSource("provideStrongPasswords")
    fun testStrongPasswords(password: String) {
        assertEquals(PasswordStrength.STRONG, passwordUtils.getStrength(password))
    }

    @ParameterizedTest
    @MethodSource("provideWeakPasswords")
    fun testMediumPasswords(password: String) {
        assertEquals(PasswordStrength.MEDIUM, passwordUtils.getStrength(password))
    }

    @ParameterizedTest
    @MethodSource("provideMediumPasswords")
    fun testWeakPasswords(password: String) {
        assertEquals(PasswordStrength.WEAK, passwordUtils.getStrength(password))
    }
    fun provideStrongPasswords(): List<String> {
        return listOf("aN we2aM", "*****Jj0", "Ux134!&")
    }

    fun provideMediumPasswords(): List<String> {
        return listOf("QWERTY2", "Admin01", "2418^ax00")
    }

    fun provideWeakPasswords(): List<String> {
        return listOf("password", "f8HdA*", "Y20220101")
    }
}