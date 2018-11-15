package Assets;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;

public class Data {
    @FXML private Pane id;
    @FXML private Label name;
    @FXML private Label manaCost;
    @FXML private Label img;
    @FXML private Label flavourText;
    @FXML private Label specialAbility;
    @FXML private Label attackPower;
    @FXML private Label defencePower;
    @FXML private Label health;

    public Pane getId() {
        return id;
    }

    public void setId(Pane id) {
        this.id = id;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public Label getManaCost() {
        return manaCost;
    }

    public void setManaCost(Label manaCost) {
        this.manaCost = manaCost;
    }

    public Label getImg() {
        return img;
    }

    public void setImg(Label img) {
        this.img = img;
    }

    public Label getFlavourText() {
        return flavourText;
    }

    public void setFlavourText(Label flavourText) {
        this.flavourText = flavourText;
    }

    public Label getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(Label specialAbility) {
        this.specialAbility = specialAbility;
    }

    public Label getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Label attackPower) {
        this.attackPower = attackPower;
    }

    public Label getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(Label defencePower) {
        this.defencePower = defencePower;
    }

    public Label getHealth() {
        return health;
    }

    public void setHealth(Label health) {
        this.health = health;
    }
}
