public class solucao1i {
  public static void main(String[] args) {
    //armazena o preço da mercadoria
    double preço;
    //armazena a quantidade de itens comprados
    int quantidade;
    //armazena o valor total a ser pego
    double total = 0;
    
    // Simulação de múltiplas mercadorias
        double[] precos = {10.0, 20.0, -5.0, 15.0, 0.0}; 
        int[] quantidades = {2, 3, -1, 4, 0};               
     
     // Laço que simula a leitura repetida dos preços e quantidades
        do {
            // Obtemos o preço simulado da mercadoria
            preco = precos[index];

            // Laço para garantir que o preço não seja negativo
            while (preco < 0) {
                System.out.println("Preço inválido. Tente novamente.");
                // Move para o próximo valor
                index++; 
                preco = precos[index];
            }

            // Obtemos a quantidade simulada de itens
            quantidade = quantidades[index];

            // Laço para garantir que a quantidade não seja negativa
            while (quantidade < 0) {
                System.out.println("Quantidade inválida. Tente novamente.");
                index++; 
                quantidade = quantidades[index];
            }

            // Se a quantidade for diferente de zero, computamos o valor
            if (quantidade != 0) {
                total += preco * quantidade;
            }

            index++;  // Passa para o próximo valor simulado

        } while (quantidade != 0);  // Para quando a quantidade for igual a zero

        // Exibe o total a ser pago
        System.out.println("Total a ser pago: R$ " + total);
    }
}