package com.example.banco;

import Classes.Cliente;
import DataBase.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginGestaoController {
    private DataBase dataBase;


    @FXML
    private Label welcomeText;
    @FXML
    private TextField tfnif;
    @FXML
    private TextField tfpass;
    @FXML
    private Button btnlogin;

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
        for(Cliente client: dataBase.clientes){
            if( Integer.parseInt(tfnif.getText())==(client.getNif()) && tfpass.getText().equals(client.getSenha())) {
                System.out.println("Login successful");
                System.out.println(dataBase.toString());

                FXMLLoader loader = new FXMLLoader(getClass().getResource("PaginaPrincipal.fxml"));
                Parent root = loader.load();

                PaginaPrincipalController paginaPrincipalController = loader.getController();
                paginaPrincipalController.receiveDatabase(dataBase,client);

                System.out.println(dataBase.cartoes.toString());
                paginaPrincipalController.getContasList(client);

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