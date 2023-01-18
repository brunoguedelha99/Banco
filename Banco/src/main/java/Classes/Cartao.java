package Classes;

import java.util.Random;

public abstract class Cartao {
    private Cliente cliente;
    private Conta conta;
    private String numero_cartao;
    private String pin;

    public Cartao(Cliente cliente,Conta conta) {
        this.cliente = cliente;
        this.conta = conta;
        this.numero_cartao = geradorNumeros();
        this.pin = geradorNumeros();
    }

    public String geradorNumeros() {
        Random rand = new Random();
        int fourDigitNumber = rand.nextInt(9999);
        return String.format("%04d",fourDigitNumber);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "cliente=" + cliente +
                ", conta=" + conta +
                ", numero_cartao='" + numero_cartao + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}


