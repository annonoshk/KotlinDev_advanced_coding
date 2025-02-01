package css

import kotlinx.css.*

fun main() {

    val myStyles = CssBuilder().apply {
      body {
          backgroundColor = Color.red
      }
    }

    val myStyle = CssBuilder().apply {
        backgroundColor = Color.red
        textAlign = TextAlign.center
    }

/*    styledDiv {
        css { +myStyle }
        +"This is a styled div!"
    }*/
/*    hover {
        backgroundColor = Color.blue
    }

    media(maxWidth(768.px)) {
        self style {
            flexDirection = FlexDirection.column
        }
    }*/
}