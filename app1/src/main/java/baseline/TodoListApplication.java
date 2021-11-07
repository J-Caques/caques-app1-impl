package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonathan Caques
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TodoListApplication extends Application {

    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
   public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("EditList.fxml"));
          primaryStage.setScene(new Scene(root, 620, 400));
          primaryStage.show();
         }
}
