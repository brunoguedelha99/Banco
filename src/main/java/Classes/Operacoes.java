package Classes;

public abstract class Operacoes {
    private Cartao cartaoUsado;
    private Conta contaUsada;
    private Float montante;

    public Operacoes(Cartao cartaoUsado, Conta contaUsada, Float montante) {
        this.cartaoUsado = cartaoUsado;
        this.contaUsada = contaUsada;
        this.montante = montante;
    }

    public Cartao getCartaoUsado() {
        return cartaoUsado;
    }

    public void setCartaoUsado(Cartao cartaoUsado) {
        this.cartaoUsado = cartaoUsado;
    }

    public Conta getContaUsada() {
        return contaUsada;
    }

    public void setContaUsada(Conta contaUsada) {
        this.contaUsada = contaUsada;
    }

    public Float getMontante() {
        return montante;
    }

    public void setMontante(Float montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return "Operacoes{" +
                "cartaoUsado=" + cartaoUsado +
                ", contaUsada=" + contaUsada +
                ", montante=" + montante +
                '}';
    }
}
