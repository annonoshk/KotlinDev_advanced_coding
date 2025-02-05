package encryption

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import java.util.Base64

fun encryptText(plainText: String, secretKey: String): String {
    val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
    val key = SecretKeySpec(secretKey.toByteArray(), "AES")
    cipher.init(Cipher.ENCRYPT_MODE, key)
    val encryptedBytes = cipher.doFinal(plainText.toByteArray())
    return Base64.getEncoder().encodeToString(encryptedBytes)
}

fun decryptText(encryptedText: String, secretKey: String): String {
    val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
    val key = SecretKeySpec(secretKey.toByteArray(), "AES")
    cipher.init(Cipher.DECRYPT_MODE, key)
    val encryptedBytes = Base64.getDecoder().decode(encryptedText)
    val decryptedBytes = cipher.doFinal(encryptedBytes)
    return String(decryptedBytes)
}

// Example usage
fun main() {
    val secretKey = "ThisIsASecretKey"
    val originalText = "Hello, World!"

    val encryptedText = encryptText(originalText, secretKey)
    println("Encrypted Text: $encryptedText")

    val decryptedText = decryptText(encryptedText, secretKey)
    println("Decrypted Text: $decryptedText")
}