package Classes;

public class Debito extends Cartao {
    private float valorLevantado;

    public Debito(Cliente cliente, Conta conta) {
        super(cliente, conta);
        this.valorLevantado = 0;
    }

    public Float getValorLevantado() {
        return valorLevantado;
    }

    public void setValorLevantado(Float valorLevantado) {
        this.valorLevantado = valorLevantado;
    }

    @Override
    public String toString() {
        return "Debito{" +
                "valorLevantado=" + valorLevantado +
                '}';
    }
}
