package com.example.banco;

import Classes.Cartao;
import Classes.Cliente;
import DataBase.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginATMController {

    private DataBase dataBase;
    @FXML
    private TextField tfCartao;
    @FXML
    private TextField tfPIN;

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Launch.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {
        for(Cartao cartao: dataBase.cartoes){
            if( tfCartao.getText().equals(cartao.getNumero_cartao()) && tfPIN.getText().equals(cartao.getPin())) {
                System.out.println("Login successful");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("ATM.fxml"));
                Parent root = loader.load();

                ATMController atmController = loader.getController();
                atmController.receiveDatabase(dataBase,cartao);

                System.out.println(dataBase.cartoes.toString());

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                return;
            }
        }
    }
    @FXML
    public void receiveDatabase(DataBase dataBase)
    {
        this.dataBase=dataBase;

    }
}
