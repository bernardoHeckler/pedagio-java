
public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Carro();
        Veiculo v2 = new Caminhao(4);
        Veiculo v3 = new Caminhao(6);
        Veiculo v4 = new Moto();
        Veiculo v5 = new Carro();
        Veiculo v6 = new Moto();

        // processarPedagio(v1);
        // processarPedagio(v2);
        // processarPedagio(v3);
        // processarPedagio(v4);
        // processarPedagio(v5);
        // processarPedagio(v6);
        // RelatorioPedagio.exibirRelatorio();
    }

    // public static void processarPedagio(Veiculo veiculo) {
    //     double valor = veiculo.calcularPedagio();
    //     System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", veiculo.getTipo(), valor);
    //     RelatorioPedagio.adicionarValor(valor);
    // }
}
