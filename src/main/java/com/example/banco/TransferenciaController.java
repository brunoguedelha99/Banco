package com.example.banco;

import Classes.Cartao;
import Classes.Conta;
import Classes.Deposito;
import Classes.Transferencia;
import DataBase.DataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TransferenciaController {

    private DataBase dataBase;
    private Cartao currentCartao;

    @FXML
    private TextField tfmontante;

    @FXML
    ChoiceBox CBcontadestino;

    public void getContas(DataBase dataBase){
        ObservableList<String> listaContas = FXCollections.observableArrayList();

        for (Conta conta: dataBase.contas){
            if (conta.equals(currentCartao.getConta())){

            }
            else {
                listaContas.add(conta.getNumero_de_conta());
                CBcontadestino.setItems(listaContas);
            }
        }
    }
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

        for(Conta conta:dataBase.contas){
            if (conta.equals(currentCartao.getConta())){
                conta.levantamento(Float.parseFloat(tfmontante.getText()));
                for(Conta conta1:dataBase.contas){
                    if (conta1.getNumero_de_conta().equals(CBcontadestino.getValue())){
                        conta1.deposito(Float.parseFloat(tfmontante.getText()));
                    }
                Transferencia transferencia=new Transferencia(currentCartao,currentCartao.getConta(),Float.parseFloat(tfmontante.getText()),conta1);
                dataBase.transferencias.add(transferencia);
                }
            }
        }
        CBcontadestino.getValue();

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
