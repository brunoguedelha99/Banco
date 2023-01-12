package Classes;

public class Credito extends Cartao {
    private float plafond;
    private int levantamentos;
    public Credito(Cliente cliente,Conta conta) {
        super(cliente,conta);
        this.levantamentos=0;
        this.plafond=0;
    }

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public int getLevantamentos() {
        return levantamentos;
    }

    public void setLevantamentos(int levantamentos) {
        this.levantamentos = levantamentos;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "plafond=" + plafond +
                ", levantamentos=" + levantamentos +
                '}';
    }
}