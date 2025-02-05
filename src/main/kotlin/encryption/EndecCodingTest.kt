package encryption

import java.security.Signature
import java.security.KeyFactory
import java.security.spec.X509EncodedKeySpec
import java.util.Base64
import java.security.PublicKey // Import for PublicKey

fun verifySignature(plainText: String, signatureText: String, publicKey: ByteArray): Boolean {
    try {
        // 1. Convert publicKey (byte array) to PublicKey object
        val keyFactory = KeyFactory.getInstance("RSA") // Or appropriate key algorithm
        val publicKeySpec = X509EncodedKeySpec(publicKey)
        val publicKeyObj: PublicKey = keyFactory.generatePublic(publicKeySpec) // Correctly get PublicKey

        // 2. Decode signatureText from Base64 to byte array
        val signatureBytes = Base64.getDecoder().decode(signatureText)

        // 3. Verify the signature
        val signature = Signature.getInstance("SHA256withRSA") // Or your algorithm
        signature.initVerify(publicKeyObj) // Use the PublicKey object
        signature.update(plainText.toByteArray())
        return signature.verify(signatureBytes)

    } catch (e: Exception) {
        e.printStackTrace() // Handle exceptions appropriately in your app
        return false
    }
}

// Example usage (for testing - not part of the function definition):
fun main() {
    val plainText = "RDD2, BB8, C3PO"

    // ***REPLACE THESE WITH YOUR ACTUAL KEY AND SIGNATURE***
    val publicKeyBase64 = "YOUR_BASE64_ENCODED_PUBLIC_KEY" // Replace with your public key
    val publicKeyBytes = Base64.getDecoder().decode(publicKeyBase64)

    val signatureBase64 = "YOUR_BASE64_ENCODED_SIGNATURE" // Replace with the signature

    val isValid = verifySignature(plainText, signatureBase64, publicKeyBytes)

    if (isValid) {
        println("Success!")
    } else {
        println("Failed!")
    }
}
/*
import java.security.KeyFactory
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.Signature
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.*

fun verifySignature(plainText: String, signatureText: String, publicKey: ByteArray): Boolean {
    try {
        val signature = Signature.getInstance("SHA256withRSA") // Or your algorithm
        val keyFactory = KeyFactory.getInstance("RSA") // Or matching key type
        val publicKeySpec = X509EncodedKeySpec(publicKey)
        val publicKeyObj = keyFactory.generatePublic(publicKeySpec)

        signature.initVerify(publicKeyObj)
        signature.update(plainText.toByteArray())

        val signatureBytes = Base64.getDecoder().decode(signatureText) // Use java.util.Base64
        return signature.verify(signatureBytes)

    } catch (e: Exception) {
        e.printStackTrace() // Handle exceptions appropriately
        return false
    }
}


fun main() {
    val plainText = "RDD2, BB8, C3PO"

    // ***REPLACE THESE WITH YOUR ACTUAL KEY AND SIGNATURE***
    val publicKeyBase64 = "PKEY" // Replace with your public key
    val publicKeyBytes = Base64.getDecoder().decode(publicKeyBase64)

    val signatureBase64 = "YOUR_BASE64_ENCODED_SIGNATURE" // Replace with the received signature

    val isValid = verifySignature(plainText, signatureBase64, publicKeyBytes)

    if (isValid) {
        println("Success!")
    } else {
        println("Verification failed.")
    }
}*/
