package example

import tornadofx.*

class HelloWorld : View() {
    override val root = flowpane {
        region { setPrefSize(Double.MAX_VALUE, 0.0) }
    }
}

class HelloWorldStyle : Stylesheet() {
    init {
        root {
            prefWidth = 400.px
            prefHeight = 400.px
        }
    }
}

class KotlinHelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

fun main(args: Array<String>) {
    launch<KotlinHelloWorldApp>()
}