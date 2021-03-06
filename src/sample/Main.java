package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene initialWindow = new Scene(root, 600, 275);
        stage.setTitle("Adam Murphy Assignment 3");
        stage.setScene(initialWindow);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
