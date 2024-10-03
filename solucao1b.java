public class solucao1b {
  public static void main(String[] args) {
    double polegadaParaCentimetro = 2.54;

        System.out.println("Tabela de Conversão: Polegadas para Centímetros");
        System.out.println("-------------------------------------------------");
        System.out.println("Polegadas\tCentímetros");

        for (int i = 1; i <= 20; i++) {
            double centimetros = i * polegadaParaCentimetro;
            System.out.printf("\t\t", i, centimetros);
        }
    }
}
