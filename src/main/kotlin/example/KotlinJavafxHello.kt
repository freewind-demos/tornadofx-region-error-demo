package example

import com.sun.javafx.application.LauncherImpl
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.FlowPane
import javafx.scene.layout.Region
import javafx.stage.Stage

class KotlinJavafxApp : Application() {

    override fun start(primaryStage: Stage) {
        val root = FlowPane().apply {
            children.add(Region().apply {
                setPrefSize(java.lang.Double.MAX_VALUE, 0.0)
            })
        }
        primaryStage.scene = Scene(root, 400.0, 200.0)
        primaryStage.show()
    }

}

object KotlinJavafxHello {
    @JvmStatic
    fun main(args: Array<String>) {
        LauncherImpl.launchApplication(KotlinJavafxApp::class.java, args)
    }
}
