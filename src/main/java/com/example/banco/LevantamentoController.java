package com.example.banco;

import Classes.Cartao;
import Classes.Conta;
import Classes.Levantamento;
import DataBase.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LevantamentoController {

    private DataBase dataBase;
    private Cartao currentCartao;
    @FXML
    private Label tflevantar;
    @FXML
    protected void onLevantarButtonClick(ActionEvent event) throws IOException {

        for(Conta conta:dataBase.contas){
            if (conta.equals(currentCartao.getConta())){
                conta.levantamento(Float.parseFloat(tflevantar.getText()));
                Levantamento levantamento=new Levantamento(currentCartao,currentCartao.getConta(),Float.parseFloat(tflevantar.getText()));
                dataBase.levantamento(levantamento);
            }
        }

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
