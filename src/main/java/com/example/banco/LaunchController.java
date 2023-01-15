package com.example.banco;

import DataBase.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LaunchController {

    private DataBase dataBase = new DataBase();
    @FXML
    protected void onGestaoButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para Gestão");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginGestao.fxml"));
        Parent root = loader.load();

        LoginGestaoController loginGestaoController = loader.getController();
        loginGestaoController.receiveDatabase(dataBase);

        System.out.println(dataBase.clientes.toString());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onATMButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para ATM");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginATM.fxml"));
        Parent root = loader.load();

        LoginATMController loginATMController = loader.getController();
        loginATMController.receiveDatabase(dataBase);

        System.out.println(dataBase.cartoes.toString());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
