public class solucao1c {
  public static void main(String[] args) {
     // Defina o limite inferior
         int limiteInferior = 0;
           
           // Defina o limite superior
              int limiteSuperior = 100; 
                 int incremento = 10 
         System.out.println("Tabela de Conversão: Celsius para Fahrenheit");
        System.out.println("-------------------------------------------------");
        System.out.println("Celsius\t\tFahrenheit");

        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(celsius + "\t\t" + fahrenheit);
        }
    }
}