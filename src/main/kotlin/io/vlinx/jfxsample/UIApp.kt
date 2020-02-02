package io.vlinx.jfxsample

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class UIApp : Application() {
    override fun start(primaryStage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.classLoader.getResource("ui.fxml"))
        primaryStage.title = "UI App Title"
        primaryStage.scene = Scene(root)
        primaryStage.minWidth = 800.0
        primaryStage.minHeight = 800.0
        primaryStage.show()
    }

    fun Launch(args: Array<String>) {
        launch(*args)
    }
}