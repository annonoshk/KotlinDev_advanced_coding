package socket

import java.io.*
import java.net.*

const val PORT = 34522

fun main(args: Array<String>) {
    try {
        ServerSocket(PORT).use { server ->
            while (true) {
                val session = Session(server.accept())
                session.start() // does not block this server thread
                println(session)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

class Session(private val socket: Socket) : Thread() {
    override fun run() {
        try {
            DataInputStream(socket.getInputStream()).use { input ->
                DataOutputStream(socket.getOutputStream()).use { output ->
                    for (i in 0..4) {
                        val msg = input.readUTF()
                        output.writeUTF(msg)
                    }
                    socket.close()
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}