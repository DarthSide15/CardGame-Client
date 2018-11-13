package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainMenuController {

    private final Pane rootPane;

    public MainMenuController(){
        rootPane = new Pane();
    }

    public Pane getRootPane(){
        return rootPane;
    }
    @FXML
    Button startButton;


    @FXML
    void handleStartButton() throws Exception{

       /* FXMLLoader loader = new FXMLLoader(getClass().getResource("game-scene-fxml"));
        startButton.getScene().setRoot(loader.getRoot());*/

       Main main = new Main();

       main.renderGame(new Stage());

        System.out.println("Button was clicked");

    }
}
