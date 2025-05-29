
public final class Caminhao extends Veiculo {

    private static final double VALOR_BASE = 10.00;
    private static final double VALOR_POR_EIXO = 2.00;

    public Caminhao(int eixo) {
        super(eixo, "Caminhão");
    }

    @Override
    public double calcularPedagio() {
        return VALOR_BASE + (VALOR_POR_EIXO * getEixo());
    }

}
