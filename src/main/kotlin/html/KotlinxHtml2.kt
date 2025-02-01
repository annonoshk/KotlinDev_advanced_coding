package html

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.dom.document
import kotlinx.html.dom.serialize
import kotlinx.html.html
import kotlinx.html.i


fun main() {
    val myDocument = document {  }

    val myElement = myDocument.createElement("htmlTag")
    val myDiv = myDocument.createElement("div")

    myDiv.append {
        i {
            +"Hyperskill"
        }
    }
    println(myDiv.serialize())

    myDocument.append {
        html {
            body {
                div {
                    attributes["id"] = "mainDiv"
                }
            }
        }
    }
    println(myDocument.serialize())

    val mainDiv = myDocument.getElementById("mainDiv")
    val newDiv = myDocument.createElement("div")
    newDiv.append {
        i {
            +"Hyperskill"
        }
    }

    mainDiv.appendChild(newDiv)
    println(myDocument.serialize())
}