package socket.ssl

import jdbc.DatabaseManager.password
import kotlinx.html.InputType
import java.security.KeyStore
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.SSLSocket
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManagerFactory

fun createSecureSocket(host: String, port: Int) {
    val sslSocketFactory = SSLSocketFactory.getDefault() as SSLSocketFactory
    val sslSocket = sslSocketFactory.createSocket(host, port) as SSLSocket

    // Enable auto-close of the socket with try-with-resources
    sslSocket.use {
        // Start handshake to establish secure connection
        it.startHandshake()
  
        // Use the socket for secure communication
    }
}

fun main() {
    val secureHost = "example.com"
    val securePort = 443 // Default port for HTTPS
    createSecureSocket(secureHost, securePort)

/*    val keyStore = KeyStore.getInstance(KeyStore.getDefaultType())
    keyStore.load(keyStoreInputStream, InputType.password.toCharArray())
    val keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm())
    keyManagerFactory.init(keyStore, InputType.password.toCharArray())
    val trustStore = KeyStore.getInstance(KeyStore.getDefaultType())
    trustStore.load(trustStoreInputStream, password.toCharArray())
    val trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
    trustManagerFactory.init(trustStore)*/
}
