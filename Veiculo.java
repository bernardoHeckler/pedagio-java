
public abstract class Veiculo {

    private int eixo;
    private String tipo;

    public Veiculo(int eixo, String tipo) {
        this.eixo = eixo;
        this.tipo = tipo;
    }

    public final int getEixo() {
        return eixo;
    }

    public final String getTipo() {
        return tipo;
    }

    public abstract double calcularPedagio();

}
