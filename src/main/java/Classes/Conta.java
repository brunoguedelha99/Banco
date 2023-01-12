package Classes;

import java.util.Random;

public class Conta {
    private String numero_de_conta;
    private Cliente titular_principal;
    private float saldo;
    //private Cliente[] titulares_secundarios= new Cliente[2];


    public Conta(Cliente titular_principal) {
        this.numero_de_conta = geradorNumeros();
        this.titular_principal= titular_principal;
        this.saldo=100;
    }

    public String geradorNumeros() {
        Random rand = new Random();
        int fourDigitNumber = rand.nextInt(99999);
        String stringRandom = String.format("%05d", fourDigitNumber);
        return stringRandom;
    }

    public void levantamento(float levantamento){
        this.saldo=saldo-levantamento;
    }

    public void deposito(float deposito){
        this.saldo=saldo+deposito;
    }

    public String getNumero_de_conta() {
        return numero_de_conta;
    }

    public void setNumero_de_conta(String numero_de_conta) {
        this.numero_de_conta = numero_de_conta;
    }

    public Cliente getTitular_principal() {
        return titular_principal;
    }

    public void setTitular_principal(Cliente titular_principal) {
        this.titular_principal = titular_principal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero_de_conta=" + numero_de_conta +
                ", titular_principal=" + titular_principal +
                ", saldo=" + saldo +
                '}';
    }
}

