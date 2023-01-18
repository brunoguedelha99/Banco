package com.example.banco;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class ContaModule {
    private SimpleStringProperty numero_de_conta;
    private SimpleObjectProperty titular_principal;
    private SimpleFloatProperty saldo;

    public ContaModule(String numero_de_conta, float saldo) {
        this.numero_de_conta = new SimpleStringProperty(numero_de_conta);
        this.saldo = new SimpleFloatProperty(saldo);
    }

    public String getNumero_de_conta() {
        return numero_de_conta.get();
    }

    public SimpleStringProperty numero_de_contaProperty() {
        return numero_de_conta;
    }

    public void setNumero_de_conta(String numero_de_conta) {
        this.numero_de_conta.set(numero_de_conta);
    }

    public Object getTitular_principal() {
        return titular_principal.get();
    }

    public SimpleObjectProperty titular_principalProperty() {
        return titular_principal;
    }

    public void setTitular_principal(Object titular_principal) {
        this.titular_principal.set(titular_principal);
    }

    public float getSaldo() {
        return saldo.get();
    }

    public SimpleFloatProperty saldoProperty() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo.set(saldo);
    }
}