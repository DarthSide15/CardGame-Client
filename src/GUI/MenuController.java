package GUI;
import GUI.Main;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MenuController {

    private Main main;

    @FXML
    void handleStartButton() throws Exception {
        // Todo: See if there is a way to change scene instead of creating a new stage
       main = new Main();
       main.renderGame(new Stage());
       System.out.println("Button was clicked");
    }

    @FXML
    void handleQuitButton() throws Exception {

    }
}
