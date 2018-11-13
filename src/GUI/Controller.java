package GUI;
import Assets.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Table card 1
    @FXML private Label tableCardNameLabel1;
    @FXML private Label tableCardMcLabel1;
    @FXML private Label tableCardFlavourTextLabel1;
    @FXML private Label tableCardSpecialAbilityLabel1;
    @FXML private Label tableCardADDPLabel1;
    @FXML private Label tableCardHPLabel1;
    //@FXML private ImageView imageView1;
    //@FXML private Rectangle rectangle1;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tableCardNameLabel1.setText("");
        tableCardMcLabel1.setText("");
        tableCardFlavourTextLabel1.setText("");
        tableCardSpecialAbilityLabel1.setText("");
        tableCardADDPLabel1.setText("");
        tableCardHPLabel1.setText("");
        //rectangle1.opacityProperty().setValue(0);
    }
}
