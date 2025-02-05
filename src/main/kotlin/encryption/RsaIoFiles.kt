package encryption

import java.io.File
import java.nio.file.Files
import java.security.KeyPairGenerator
import java.security.KeyPair
import java.security.KeyFactory
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher


val seperator: String = File.separator // ${seperator}
val workingDirectory: String = System.getProperty ("user.dir")
val absolutePath = "${workingDirectory}${seperator}src${seperator}main${seperator}kotlin${seperator}encryption${seperator}"

fun encryptFile(inputFile: File, outputFile: File, publicKey: ByteArray) {
    val cipher = Cipher.getInstance("RSA")
    val keyFactory = KeyFactory.getInstance("RSA")
    val publicKeySpec = X509EncodedKeySpec(publicKey)
    val publicKeyObj = keyFactory.generatePublic(publicKeySpec)
    cipher.init(Cipher.ENCRYPT_MODE, publicKeyObj)

    val inputStream = inputFile.inputStream()
    val outputStream = outputFile.outputStream()
    val buffer = ByteArray(4096)
    var bytesRead = inputStream.read(buffer)
    while (bytesRead != -1) {
        val encryptedBytes = cipher.doFinal(buffer, 0, bytesRead)
        outputStream.write(encryptedBytes)
        bytesRead = inputStream.read(buffer)
    }

    inputStream.close()
    outputStream.close()
}

fun decryptFile(inputFile: File, outputFile: File, privateKey: ByteArray) {
    val cipher = Cipher.getInstance("RSA")
    val keyFactory = KeyFactory.getInstance("RSA")
    val privateKeySpec = PKCS8EncodedKeySpec(privateKey)
    val privateKeyObj = keyFactory.generatePrivate(privateKeySpec)
    cipher.init(Cipher.DECRYPT_MODE, privateKeyObj)

    val inputStream = inputFile.inputStream()
    val outputStream = outputFile.outputStream()
    val buffer = ByteArray(4096)
    var bytesRead = inputStream.read(buffer)
    while (bytesRead != -1) {
        val decryptedBytes = cipher.doFinal(buffer, 0, bytesRead)
        outputStream.write(decryptedBytes)
        bytesRead = inputStream.read(buffer)
    }

    inputStream.close()
    outputStream.close()
}

fun main() {
    // Generate key pair
    val keyPair = generateKeyPair2()

    val inputFile = File("${absolutePath}input.txt")
    val encryptedFile = File("${absolutePath}encryptedRsa.bin")
    val decryptedFile = File("${absolutePath}decryptedRsa.txt")

    // Encrypt the input file using the public key
    encryptFile(inputFile, encryptedFile, keyPair.public.encoded)
    println("File encrypted.")

    // Decrypt the encrypted file using the private key
    decryptFile(encryptedFile, decryptedFile, keyPair.private.encoded)
    println("File decrypted.")
}

fun generateKeyPair2(): KeyPair {
    val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
    keyPairGenerator.initialize(2048)
    return keyPairGenerator.generateKeyPair()
}