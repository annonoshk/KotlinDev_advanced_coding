package socket

import java.io.*
import java.net.*
/*
const val PORT = 34522

fun main(args: Array<String>) {
    try {
        ServerSocket(PORT).use { server ->
            while (true) {
                server.accept().use { socket ->
                    DataInputStream(socket.getInputStream()).use { input ->
                        DataOutputStream(socket.getOutputStream()).use { output ->
                            val msg = input.readUTF() // read a message from the client
                            output.writeUTF(msg)      // resend it to the client
                        }
                    }
                }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }

}*/

/*
 * Client side */

const val SERVER_ADDRESS = "127.0.0.1"
const val SERVER_PORT = 34522

fun main(args: Array<String>) {
    try {
        Socket(SERVER_ADDRESS, SERVER_PORT).use { socket ->
            DataInputStream(socket.getInputStream()).use { input ->
                DataOutputStream(socket.getOutputStream()).use { output ->
                    val msg = readln()
                    output.writeUTF(msg)              // send a message to the server
                    val receivedMsg = input.readUTF() // read the reply from the server
                    println("Received from the server: $receivedMsg")
                }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
