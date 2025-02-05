package encryption

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption


/*val seperator: String = File.separator // ${seperator}
val workingDirectory: String = System.getProperty ("user.dir")
val absolutePath = "${workingDirectory}${seperator}src${seperator}main${seperator}kotlin${seperator}encryption${seperator}"*/


fun encryptFile(inputFilePath: String, outputFilePath: String, secretKey: String) {
    val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
    val key = SecretKeySpec(secretKey.toByteArray(), "AES")
    cipher.init(Cipher.ENCRYPT_MODE, key)

    val inputFileBytes = Files.readAllBytes(Paths.get(inputFilePath))
    val encryptedBytes = cipher.doFinal(inputFileBytes)

    Files.write(Paths.get(outputFilePath), encryptedBytes, StandardOpenOption.CREATE)
}

fun decryptFile(inputFilePath: String, outputFilePath: String, secretKey: String) {
    val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
    val key = SecretKeySpec(secretKey.toByteArray(), "AES")
    cipher.init(Cipher.DECRYPT_MODE, key)

    val encryptedBytes = Files.readAllBytes(Paths.get(inputFilePath))
    val decryptedBytes = cipher.doFinal(encryptedBytes)

    Files.write(Paths.get(outputFilePath), decryptedBytes, StandardOpenOption.CREATE)
}

fun main() {
    val inputFilePath = "${absolutePath}input.txt"
    val encryptedFilePath = "${absolutePath}encryptedAes.bin"
    val decryptedFilePath = "${absolutePath}decryptedAes.txt"
    val secretKey = "ThisIsASecretKey"

    // Encrypt the file
    encryptFile(inputFilePath, encryptedFilePath, secretKey)
    println("File encrypted successfully.")

    // Decrypt the file
    decryptFile(encryptedFilePath, decryptedFilePath, secretKey)
    println("File decrypted successfully.")
}