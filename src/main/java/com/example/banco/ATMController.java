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
import javafx.stage.Stage;

import java.io.IOException;

public class ATMController {
    private DataBase dataBase;
    private Cartao currentCartao;
    @FXML
    protected void onLevantamentoButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para Levantamento");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Levantamento.fxml"));
        Parent root = loader.load();

        LevantamentoController levantamentoController = loader.getController();
        levantamentoController.receiveDatabase(dataBase,currentCartao);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onDepositoButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para Deposito");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposito.fxml"));
        Parent root = loader.load();

        DepositoController depositoController = loader.getController();
        depositoController.receiveDatabase(dataBase,currentCartao);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onTransferenciaButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para Transferencia");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Transferencia.fxml"));
        Parent root = loader.load();

        TransferenciaController transferenciaController = loader.getController();
        transferenciaController.receiveDatabase(dataBase,currentCartao);

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
