package html

import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.dom.document
import kotlinx.html.dom.serialize
import operatorOverloading.unaryPlus

/*
fun main() {
    img {
        attrs["class"] = "myImage"
        attrs["src"] = "https://example.com/image.png"
    }

    img {
        attributes["class"] = "myImage"
        attributes["src"] = "https://example.com/image.png"
    }

    img {
        "class" = "myImage"
        "src" = "https://example.com/image.png"
    }

    img(classes = "myImage", src = "https://example.com/image.png") {
    }

    img {
        class: "myImage"
        src: "https://example.com/image.png"
    }
}*/

fun main() {
    val myDocument = document { }
    myDocument.append {
        +"<!DOCTYPE html>"
        html {
            body {
                h1 { +"Hello world!" }
                div {
                    p { +"Paragraph 1" }
                    p { +"Paragraph 2" }
                }
                p { +"Paragraph 3" }
            }
        }
    }
    println(myDocument.serialize())
    val myDocument2 = document { }
    myDocument2.append {
        html {
            body {
                for (i in 1..10) {
                    div {
                        /*attributes["id"] = */+"$i"
                    }
                }
            }
        }
    }
    println(myDocument2.serialize())
}