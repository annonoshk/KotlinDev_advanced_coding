package socket.ssl

import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.UnknownHostException
import java.security.SecureRandom
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLHandshakeException
import javax.net.ssl.SSLSocket
import javax.net.ssl.SSLSocketFactory

/**
 * @description : SSL pitfalls troubleshooting guide
 *
 */

 fun main() {
 // 1. 1. SSLHandshakeException
     /*Troubleshooting:

Verify the server's SSL certificate.
Ensure the client trusts the server's certificate.
Check for correct protocol versions.
*/
     try {
         val sslContext = SSLContext.getInstance("TLS")
         val trustAllCerts = null
         sslContext.init(null, trustAllCerts, SecureRandom())
         val socketFactory = sslContext.socketFactory
         val socket = socketFactory.createSocket("hostname", 443)
         // Use the socket...
     } catch (e: SSLHandshakeException) {
         // Handle exception
     }
// 2. UnknownHostException
    /*Troubleshooting:

Check the internet connection.
Ensure the domain name is correct.
Try resolving the domain from the command line (ping hostname).
*/
    try {
        val address = InetAddress.getByName("hostname")
        val socket = SSLSocketFactory.getDefault().createSocket(address, 443)
        // Use the socket...
    } catch (e: UnknownHostException) {
        // Handle exception
    }

    /*3. SocketTimeoutException
A timeout can occur if the server is unresponsive or the network latency is too high.

Troubleshooting:

Increase the socket timeout.
Check server availability.
*/
    val socket = SSLSocketFactory.getDefault().createSocket() as SSLSocket
    socket.connect(InetSocketAddress("hostname", 443), 10000) // Timeout in milliseconds
    // Use the socket...

/*4. NoRouteToHostException
This exception suggests a routing issue, often caused by a firewall blocking the connection.

Troubleshooting:

Check firewall settings.
Ensure the network path to the server is clear.
*/
/*5. CertificateExpiredException
Occurs when the SSL certificate has expired.

Troubleshooting:

Renew the server's SSL certificate.
Ensure the client's system time is correct.
*/ System.setProperty("javax.net.debug", "ssl")   
}

