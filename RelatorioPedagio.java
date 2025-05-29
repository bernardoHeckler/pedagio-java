public class RelatorioPedagio {
    private static double totalArrecadado = 0;
    private static int contador = 0;

    private RelatorioPedagio(){
    }

    public static void adicionarValor(double valor){
        totalArrecadado += valor;
        contador++;
    }

    public static void exibirRelatorio(){
        System.out.println("==== RELATÓRIO DO PEDÁGIO ====");
        System.out.printf("Total de Veículos: %d%n", contador);
        System.out.printf("Total Arrecadado: R$ %.2f%n", totalArrecadado);
    }
}
