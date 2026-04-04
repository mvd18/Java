package io.github.mvd18.task11b;

/* Автор: Макковеева В.Д.

Задача:
Даны x, y, z. Вычислите a, b если ...
https://bgu-chita.ru/zadachnik/Glava01/index01.htm
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("wind_task11.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 689, 490);
        stage.setTitle("Task11b");
        stage.setScene(scene);
        stage.show();
    }
}
