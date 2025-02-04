package encryption

import java.security.KeyPairGenerator
import java.security.KeyPair
import java.security.KeyFactory
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher
import java.util.Base64

fun encryptText(plainText: String, publicKey: ByteArray): String {
    val cipher = Cipher.getInstance("RSA")
    val keyFactory = KeyFactory.getInstance("RSA")
    val publicKeySpec = X509EncodedKeySpec(publicKey)
    val publicKeyObj = keyFactory.generatePublic(publicKeySpec)
    cipher.init(Cipher.ENCRYPT_MODE, publicKeyObj)
    val encryptedBytes = cipher.doFinal(plainText.toByteArray())
    val encodedBytes = Base64.getEncoder().encode(encryptedBytes)
    return String(encodedBytes)
}

fun decryptText(encryptedText: String, privateKey: ByteArray): String {
    val cipher = Cipher.getInstance("RSA")
    val keyFactory = KeyFactory.getInstance("RSA")
    val privateKeySpec = PKCS8EncodedKeySpec(privateKey)
    val privateKeyObj = keyFactory.generatePrivate(privateKeySpec)
    cipher.init(Cipher.DECRYPT_MODE, privateKeyObj)
    val decodedBytes = Base64.getDecoder().decode(encryptedText)
    val decryptedBytes = cipher.doFinal(decodedBytes)
    return String(decryptedBytes)
}

fun main() {
    // Generate key pair
    val keyPair = generateKeyPair()

    val originalText = "Hello, World!"

    // Encrypt the text using the public key
    val encryptedText = encryptText(originalText, keyPair.public.encoded)
    println("Encrypted Text: $encryptedText")

    // Decrypt the encrypted text using the private key
    val decryptedText = decryptText(encryptedText, keyPair.private.encoded)
    println("Decrypted Text: $decryptedText")
}

fun generateKeyPair(): KeyPair {
    val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
    keyPairGenerator.initialize(2048)
    return keyPairGenerator.generateKeyPair()
}