package io.vlinx.jfxsample

import javafx.application.Application
import javafx.stage.Stage

class UIApp : Application() {
    override fun start(primaryStage: Stage?) {
        if (primaryStage == null) {
            return
        }

        primaryStage.show()
    }

    fun Launch(args: Array<String>) {
        launch(*args)
    }
}