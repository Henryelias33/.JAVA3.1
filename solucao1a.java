public class solucao1a
  public static void main(String[] args) {
    // valor do numero limite 
      int limite = 10;
         int a = 0, b = 1;
            
            
            System.out.println("Sequência de Fibonacci até " + limite + ":");
           while (a <= limite) {
         System.out.println( a + " ");
        int proximo = a + b;
      a = b;
     b = proximo;
    }
  }
  
}