package html

import kotlinx.html.*
import kotlinx.html.dom.*

fun main() {
    val myDocument1 = document { }
    myDocument1.append {
        html {
            head {
                title {
                    +"My html page"
                }
            }
            body {
                h1 {
                    +"Hello user!"
                }
            }
        }
    }

    // comment from user
    println(myDocument1.serialize())
    val myDocument2 = document { }
    val comments = mutableListOf("Hello, everyone!", "Great site", "Nice :)")
    myDocument2.append {
        html {
            body {
                for (comment in comments) {
                    div {
                        +comment
                    }
                }
            }
        }
    }
    println(myDocument2.serialize())

    //setting attributes
    val myDocument3 = document {  }
    myDocument3.append {
        html {
            body {
                a {
                    +"visit us"
                }
            }
        }
    }
    println(myDocument3.serialize())

/*    htmlElement {
        attributes["attributeName"] = "attributeValue"

        +"htmlElement's content"
    }
    a {
        attributes["href"] = "hyperskill.org"
        +"visit us"
    }*/
    // <a href="hyperskill.org">visit us</a>

/*    a(href = "hyperskill.org", classes = "mylink") {
        +"visit us"
    }*/

}