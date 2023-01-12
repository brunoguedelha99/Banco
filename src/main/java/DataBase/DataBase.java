package DataBase;

import Classes.*;

import java.util.ArrayList;


public class DataBase {

    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Conta> contas = new ArrayList<>();
    public ArrayList<Cartao> cartoes = new ArrayList<>();
    public ArrayList<Credito> creditos = new ArrayList<>();
    public ArrayList<Debito> debitos = new ArrayList<>();
    public ArrayList<Operacoes> operacoes= new ArrayList<>();
    public ArrayList<Levantamento> levantamentos=new ArrayList<>();
    public ArrayList<Deposito> depositos=new ArrayList<>();
    public ArrayList<Transferencia> transferencias=new ArrayList<>();

    public DataBase(){
        clientes.add(new Cliente("Joao",1,"pintor",23,"03/08/1999","joao@gmail.com","12345"));
        clientes.add(new Cliente("Diogo",2,"escritor",24,"25/05/1998","diogo@gmail.com","12345"));
        clientes.add(new Cliente("Rafael",3,"jogador",21,"13/10/2001","rafael@gmail.com","12345"));
        clientes.add(new Cliente("Jorge",4,"streamer",20,"06/11/2002","jorge@gmail.com","12345"));

        Conta conta1 = new Conta(getCliente(1));
        contas.add(conta1);
        Conta conta2 = new Conta(getCliente(2));
        contas.add(conta2);
        Conta conta3 = new Conta(getCliente(3));
        contas.add(conta3);
        Conta conta4 = new Conta(getCliente(4));
        contas.add(conta4);

        creditos.add(new Credito(getCliente(1),conta1));
        debitos.add(new Debito(getCliente(1),conta1));
        creditos.add(new Credito(getCliente(2),conta2));
        debitos.add(new Debito(getCliente(2),conta2));
        creditos.add(new Credito(getCliente(3),conta3));
        debitos.add(new Debito(getCliente(3),conta3));
        creditos.add(new Credito(getCliente(4),conta4));
        debitos.add(new Debito(getCliente(4),conta4));

        cartoes.addAll(creditos);
        cartoes.addAll(debitos);

    }

    public void levantamento(Levantamento levantamento){
        levantamentos.add(levantamento);
        operacoes.add(levantamento);
    }

    public void deposito(Deposito deposito){
        depositos.add(deposito);
        operacoes.add(deposito);
    }

    public void transferencia(Transferencia transferencia){
        transferencias.add(transferencia);
        operacoes.add(transferencia);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public ArrayList<Credito> getCreditos() {
        return creditos;
    }

    public void setCreditos(ArrayList<Credito> creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Debito> getDebitos() {
        return debitos;
    }

    public void setDebitos(ArrayList<Debito> debitos) {
        this.debitos = debitos;
    }

    public ArrayList<Operacoes> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(ArrayList<Operacoes> operacoes) {
        this.operacoes = operacoes;
    }

    public ArrayList<Levantamento> getLevantamentos() {
        return levantamentos;
    }

    public void setLevantamentos(ArrayList<Levantamento> levantamentos) {
        this.levantamentos = levantamentos;
    }

    public ArrayList<Deposito> getDepositos() {
        return depositos;
    }

    public void setDepositos(ArrayList<Deposito> depositos) {
        this.depositos = depositos;
    }

    public ArrayList<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(ArrayList<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }

    public Cliente getCliente(Integer integer) {
        for (Cliente cliente : clientes) {
            if (cliente.getNif() == integer) {
                 return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "clientes=" + clientes +
                ", contas=" + contas +
                '}';
    }
}
