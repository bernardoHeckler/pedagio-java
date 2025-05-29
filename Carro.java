public final class Carro extends Veiculo {

    public Carro() {
        super(2, "Carro");
    }

    @Override
    public double calcularPedagio() {
        return 5.00;
    }
}