package encryption

import java.security.KeyPairGenerator
import java.security.KeyPair
import java.nio.file.Files
import java.nio.file.Paths
import java.security.PrivateKey
import java.security.Signature
import java.security.PublicKey

fun generateDSAKeyPair(): KeyPair {
    val keyGen = KeyPairGenerator.getInstance("DSA")
    keyGen.initialize(1024)
    return keyGen.generateKeyPair()
}

fun signFile(filePath: String, privateKey: PrivateKey): ByteArray {
    val signature = Signature.getInstance("SHA1withDSA")
    signature.initSign(privateKey)

    val fileBytes = Files.readAllBytes(Paths.get(filePath))
    signature.update(fileBytes)

    return signature.sign()
}

fun verifySignature(filePath: String, publicKey: PublicKey, signatureBytes: ByteArray): Boolean {
    val signature = Signature.getInstance("SHA1withDSA")
    signature.initVerify(publicKey)

    val fileBytes = Files.readAllBytes(Paths.get(filePath))
    signature.update(fileBytes)

    return signature.verify(signatureBytes)
}

fun main() {
    val keyPair = generateDSAKeyPair()

    val filePath = "${absolutePath}input.txt"
    val signature = signFile(filePath, keyPair.private)

    val isVerified = verifySignature(filePath, keyPair.public, signature)
    println("La firma es ${if (isVerified) "Succes!" else "Failure! :("}")
}