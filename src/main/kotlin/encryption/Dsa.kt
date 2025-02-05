package encryption

import java.security.*
import java.util.Base64

fun generateKeyPairDsa(): KeyPair {
    val keyPairGenerator = KeyPairGenerator.getInstance("DSA")
    keyPairGenerator.initialize(2048)
    return keyPairGenerator.generateKeyPair()
}

fun signData(data: ByteArray, privateKey: PrivateKey): ByteArray {
    val signature = Signature.getInstance("SHA256withDSA")
    signature.initSign(privateKey)
    signature.update(data)
    return signature.sign()
}

fun verifySignature(data: ByteArray, signatureBytes: ByteArray, publicKey: PublicKey): Boolean {
    val signature = Signature.getInstance("SHA256withDSA")
    signature.initVerify(publicKey)
    signature.update(data)
    return signature.verify(signatureBytes)
}

fun main() {
    val keyPair = generateKeyPairDsa()

    val data = "Hello, World!".toByteArray()
    val signatureBytes = signData(data, keyPair.private)

    val signature = Base64.getEncoder().encodeToString(signatureBytes)
    println("Signature: $signature")

    val isVerified = verifySignature(data, signatureBytes, keyPair.public)
    println("Signature Verified: $isVerified")
}