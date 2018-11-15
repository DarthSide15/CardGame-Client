package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;

public class Data {
    @FXML public Pane id;
    @FXML public Label name;
    @FXML public Label manaCost;
    @FXML public Label img;
    @FXML public Label flavourText;
    @FXML public Label specialAbility;
    @FXML public Label attackPower;
    @FXML public Label defencePower;
    @FXML public Label health;

    public Data(Pane id, Label name, Label manaCost, Label img, Label flavourText, Label specialAbility, Label attackPower, Label defencePower, Label health) {
        this.id = id;
        this.name = name;
        this.manaCost = manaCost;
        this.img = img;
        this.flavourText = flavourText;
        this.specialAbility = specialAbility;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.health = health;
    }

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
