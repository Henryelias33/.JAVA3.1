public class solucao1g {
   public static void main(String[] args) {
    //valor do limite superior é 15
      int limiteSuperior = 15;
      
        //percorre todos os numeros de 1 até Superior
      for (int i= 1; i < limiteSuperior; i++) {
          // Verifica se o número atual é ímpar usando o operador de módulo
         if (i % 2 != 0) {
                // Se o número for ímpar, imprime o valor
            System.out.print(i + " ");
         }
      }
   }
}