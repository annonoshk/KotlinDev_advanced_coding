package documentation

/**
 * Person model class
 * @property name String The name of the person
 * @property age Int The age of the person
 * @property dni String The id card of the person
 * @author Hyperskill
 * @since 1.0
 * @constructor Creates a Person object
 */
data class PersonDokka(val name: String, val age: Int, val dni: String) {
    /**
     * Checks if the person is an adult
     * @return true if the person is an adult, false otherwise
     * @since 1.0
     * @see Person
     */
    fun isAdult(): Boolean {
        return age >= 18
    }

    /**
     * Checks if the person is a teenager
     * @return true if the person is a teenager, false otherwise
     * @since 1.0
     * @see PersonDokka
     */
    fun isValidDni(): Boolean {
        if (!Regex("[0-9]{8}[A-Z]").matches(dni)) {
            return false
        }
        val letter = dni.last()
        val number = dni.substring(0, 8).toInt()
        val remainder = number.toInt() % 23
        val letters = "TRWAGMYFPDXBNJZSQVHLCKE"
        val correctLetter = letters[remainder]
        return letter == correctLetter
    }
}