package GUI;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    @FXML
    private HBox playerHand = new HBox();
    @FXML
    private HBox enemyHand = new HBox();
    @FXML
    private HBox playerTableCards = new HBox();
    @FXML
    private HBox enemyTableCards = new HBox();


    @FXML
    private List<Data> data = new ArrayList<Data>;

    @FXML
    public void placePlayerHandCards() {
        for(int i = 0; i < data.size(); i++) {
            playerHand.getChildren().addAll();
        }
    }
    @FXML
    public void placeEnemyHandCards(){
        for(int i = 0; i < data.size(); i++) {
            enemyHand.getChildren().addAll();
        }
    }
    @FXML
    public void placePlayerTableCards() {

    }
}
