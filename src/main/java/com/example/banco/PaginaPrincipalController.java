package com.example.banco;

import Classes.Cliente;
import Classes.Conta;
import DataBase.DataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipalController {

    private DataBase dataBase;

    private Cliente currentClient;
    @FXML
    private Label LabelNome;

    @FXML
    private Label LabelSaldo;

    @FXML
    TableView<ContaModule> tvContas;

    @FXML
    TableColumn<ContaModule,Integer> tcNumeroConta;

    @FXML
    TableColumn<ContaModule,Float> tcSaldo;

    @FXML
    protected void onContaButtonClick() throws IOException {
        dataBase.contas.add(new Conta(currentClient));
        getContasList(currentClient);
    }

    @FXML
    protected void onCartoesButtonClick(ActionEvent event) throws IOException {

        System.out.println("Mudar para contas");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cartoes.fxml"));
        Parent root = loader.load();

        //PaginaPrincipalController firstPageController = loader.getController();
        //firstPageController.displayName(dataBase.clients.get(client));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void getContasList(Cliente client){
        final ObservableList<ContaModule> contaList= FXCollections.observableArrayList();
        double saldototal = 0;
        for (Conta conta1:dataBase.contas){
            if(conta1.getTitular_principal().equals(client)){
                ContaModule contaModule= new ContaModule(conta1.getNumero_de_conta(),conta1.getSaldo());
                contaList.add(contaModule);

                saldototal = saldototal + conta1.getSaldo();
                LabelSaldo.setText("Saldo total: "+saldototal);

                tcNumeroConta.setCellValueFactory(new PropertyValueFactory<>("numero_de_conta"));
                tcSaldo.setCellValueFactory(new  PropertyValueFactory<>("saldo"));
                tvContas.setItems(contaList);
            }
        }
    }

    @FXML
    public void receiveDatabase(DataBase dataBase,Cliente cliente)
    {
        this.dataBase=dataBase;
        currentClient=cliente;
        LabelNome.setText("Bem vindo "+cliente.getNome());
    }

}
