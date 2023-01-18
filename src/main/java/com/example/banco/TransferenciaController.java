package com.example.banco;

import Classes.Cartao;
import Classes.Conta;
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

public class TransferenciaController {

    private DataBase dataBase;
    private Cartao currentCartao;
    @FXML
    private TextField tfdestino;
    @FXML
    private TextField tfmontante;

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ATM.fxml"));
        Parent root = loader.load();

        ATMController atmController = loader.getController();
        atmController.receiveDatabase(dataBase,currentCartao);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onTransferirButtonClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ATM.fxml"));
        Parent root = loader.load();

        ATMController atmController=loader.getController();
        atmController.receiveDatabase(dataBase,currentCartao);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void receiveDatabase(DataBase dataBase, Cartao cartao)
    {
        this.dataBase=dataBase;
        this.currentCartao=cartao;
    }
}
