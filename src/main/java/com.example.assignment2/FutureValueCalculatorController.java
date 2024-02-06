package com.example.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FutureValueCalculatorController {

    double futureValue = 0;

    @FXML
    private Label actIntrstRateLabel;

    @FXML
    private TextField actIntrstRateTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label futureValueLabel;

    @FXML
    private TextField futureValueTextField;

    @FXML
    private Label invAmntLabel;

    @FXML
    private TextField invAmntTextField;

    @FXML
    private Label numYrsLabel;

    @FXML
    private TextField numYrsTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        //perform calculation
        double investmentAmount = Double.parseDouble(invAmntTextField.getText());
        double rate = Double.parseDouble(actIntrstRateTextField.getText());
        double numYears = Double.parseDouble(numYrsTextField.getText());

        double futureValue = investmentAmount * Math.pow(1 + rate / 100, numYears);

        futureValueTextField.setText(String.format("$%,.2f", futureValue));

    }

}