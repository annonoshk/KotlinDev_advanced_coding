package encoding

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
fun main() {
    val text1 = "Huck Kim!"
    val encodedText = Base64.Default.encode(text1.toByteArray())
    println(encodedText) // SG9sYSE=

    val url = "https://hyperskill.org/study-plan"
    val encodedUrl: String = Base64.UrlSafe.encode(url.toByteArray())
    println(encodedUrl) // aHR0cHM6Ly9oeXBlcnNraWxsLm9yZy9zdHVkeS1wbGFu

    println(encodedText) // aHR0cHM6Ly9oeXBlcnNraWxsLm9yZy9zdHVkeS1wbGFu
    println(String(Base64.UrlSafe.decode(encodedText)))

}