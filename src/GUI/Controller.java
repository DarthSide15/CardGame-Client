package GUI;
import Assets.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private List<BasicCard> playerAHand;
    private List<BasicCard> tableCards;

    BasicCreatureCard card = null;

    //Table card 1
    @FXML private Label tableCardNameLabel1;
    @FXML private Label tableCardMcLabel1;
    @FXML private Label tableCardFlavourTextLabel1;
    @FXML private Label tableCardADDPLabel1;
    @FXML private Label tableCardHPLabel1;
    @FXML private Label handCardName1;
    @FXML private Label handCardMc1;
    @FXML private Label handCardFlavourText1;
    @FXML private Label handCardADDP1;
    @FXML private Label handCardHP1;

  //  data[0].tableCardNameLabel;

    @FXML private Pane pane1;
//    @FXML private Pane pane2;
   // @FXML private Label tableCardSpecialAbilityLabel1;
//    @FXML private Label tableCardADDPLabel1;
//    @FXML private Label tableCardHPLabel1;
//    @FXML private Label tableCardNameLabel2;
//    @FXML private Label tableCardMcLabel2;
//    @FXML private Label tableCardFlavourTextLabel2;
//   // @FXML private Label tableCardSpecialAbilityLabel2;
//    @FXML private Label tableCardADDPLabel2;
//    @FXML private Label tableCardHPLabel2;
    //@FXML private ImageView imageView1;
    //@FXML private Rectangle rectangle1;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableCards = new ArrayList<>();
        playerAHand = new ArrayList<>(Arrays.asList(
                new BasicCreatureCard(1, "Marshmallow", "White soft treat", "does not exist yet", 0, 1, 2,1,1),
                new BasicCreatureCard(2, "Plopp","Chocolate with gooey caramel center", "does not exist", 0, 2, 1,1,1),
                new BasicCreatureCard(3, "Smash", "Crispy chocolate treat", "does not exist yet", 0, 5, 1,1,1),
                new BasicCreatureCard(4, "Crazy face", "Sour chewy candy", "does not exist yet", 0, 1, 1,1,1),
                new BasicCreatureCard(5, "Djungelvrål", "Licorice candy that makes you scream", "does not exist yet", 0, 2, 2,1,1),
                new BasicCreatureCard(6, "Nick's", "Sugar-free candy", "does not exist yet", 0, 3, 3,1,1),
                new BasicCreatureCard(7, "Daim", "Chocolate with hard filling", "does not exist yet", 0, 3, 5,1,1),
                new BasicCreatureCard(8, "Bounty", "Chocolate with coconut filling", "does not exist yet", 0, 2, 1,1,1),
                new BasicCreatureCard(9, "Hubba Bubba", "Sweet chewing-gum", "does not exist yet", 0, 3, 31,1,1),
                new BasicCreatureCard(10, "Raisin", "Dried up grapes pretending to be candy", "does not exist yet",0, 1, 1,1,1))
        );
        //Player Hand
        handCardName1.setText(playerAHand.get(0).getName());
        handCardMc1.setText(Integer.toString(playerAHand.get(0).getManaCost()));
        handCardFlavourText1.setText((playerAHand.get(0).getFlavourText()));
       //tableCardSpecialAbilityLabel1.setText((playerADeck.get(0).getSp()));
        handCardADDP1.setText(Integer.toString(((BasicCreatureCard)playerAHand.get(0)).getAttack()));
        handCardHP1.setText(Integer.toString(((BasicCreatureCard)playerAHand.get(0)).getHealth()));
        //rectangle1.opacityProperty().setValue(0);

    }
    public void mouseClick() {
        pane1.setOnMouseClicked((MouseEvent event) -> {

//            Dragboard db = pane1.startDragAndDrop(TransferMode.MOVE);
            card = (BasicCreatureCard)playerAHand.get(0);
            tableCards.add(card);
            playerAHand.remove(0);

            tableCardNameLabel1.setText(tableCards.get(0).getName());
            tableCardMcLabel1.setText(Integer.toString(tableCards.get(0).getManaCost()));
            tableCardFlavourTextLabel1.setText((tableCards.get(0).getFlavourText()));
            //tableCardSpecialAbilityLabel1.setText((playerADeck.get(0).getSp()));
            tableCardADDPLabel1.setText(Integer.toString(((BasicCreatureCard) tableCards.get(0)).getAttack()));
            tableCardHPLabel1.setText(Integer.toString(((BasicCreatureCard) tableCards.get(0)).getHealth()));

            event.consume();
        });
    }

}
