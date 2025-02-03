package encoding

import java.util.Base64

fun main() {
    val mime = "k333d6ebc30f8a22d993-0iikik3-4fc3-a9b1-949b2d5463ddk333d6ebc30f8a22d993-0iikik3-4fc3-a9b1-949b2d5463ddk333d6ebc30f8a22d993-0iikik3-4fc3-a9b1-949b2d5463dd"
    val encodedMime = Base64.getMimeEncoder().encodeToString(mime.toByteArray())
    println(encodedMime)

    println(String(Base64.getMimeDecoder().decode(encodedMime)))
}