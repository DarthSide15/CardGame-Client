package GUI;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private HBox player = new HBox(5);
    private HBox enemy = new HBox(5);

    @FXML
    private List<Data> data = new ArrayList<Data>;

    @FXML
    public void placePlayerHandCards() {
        for(int i = 0; i < data.size(); i++) {
            player.getChildren().addAll();
        }
    }
    @FXML
    public void placeEnemyHandCards(){
        for(int i = 0; i < data.size(); i++) {
            enemy.getChildren().addAll();
        }
    }
}
