package Classes;

public class Transferencia extends Operacoes{
    private Conta contaDestino;

    public Transferencia(Cartao cartaoUsado, Conta contaUsada, Float montante, Conta contaDestino) {
        super(cartaoUsado, contaUsada, montante);
        this.contaDestino = contaDestino;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    @Override
    public String toString() {
        return "Transferencia{" +
                "contaDestino=" + contaDestino +
                '}';
    }
}
