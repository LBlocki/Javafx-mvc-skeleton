package com.yoursurname.yourappname.controllers;

import com.yoursurname.yourappname.model.Clicker;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * This controller is assigned to fxml view. It is better when fxml file points to the controller
 * than the other way around. You can avoid a lot of problems with this method
 */
public class ExampleController {

    /**
     * FXML annotation links fxml object with this one here. Simple and works. If you want better control
     * checkout method initialize for javaFX
     */
    @FXML
    public Button clickButton;

    @FXML
    public Label amountOfClicks;

    private Clicker clicker;

    public ExampleController() {
        clicker = Clicker.getInstance();
    }

    /**
     * You can access like this multiple events like mouse click, key pressed and read it by adding argument to method
     * Here you can see controller communicating directly with model. If you wish to be fancy than you can create
     * service layer for model that will be an interface for communicating with controllers.
     */
    public void increaseClicks() {
        clicker.increaseAmountOfClicks(1);
        amountOfClicks.setText(clicker.getAmountOfClicks().toString());
    }
}
