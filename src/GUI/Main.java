package GUI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent menu = FXMLLoader.load(getClass().getResource("main-menu-scene.fxml"));
        primaryStage.setTitle("Candy Wars");
        primaryStage.setScene(new Scene(menu, 1280, 720));
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

    public void renderGame(Stage gameStage) throws Exception {
        Parent game = FXMLLoader.load(getClass().getResource("game-scene.fxml"));
        gameStage.setTitle("Candy Wars");
        gameStage.setScene(new Scene(game, 1280, 720));
        gameStage.show();
    }

