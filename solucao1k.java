public class solucao1k
    public static void main(String[] args) {
        // Simulação de entrada dos números reais
          double numero1 = 10.5;
            double numero2 = 5.0;  

              // Variável para armazenar a opção do menu
                int opcaoMenu = 0;

                  // Loop principal que exibe o menu até que o usuário escolha sair
                     while (opcaoMenu != 9) {
            // Exibe o menu de operações disponíveis
            System.out.println("Operações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.println("Digite o número de ordem da opção desejada:");

            // Simulação da escolha do menu
            // Aqui você pode alterar a variável para simular diferentes escolhas
            opcaoMenu = 4;

            // Executa a operação correspondente à opção escolhida
            if (opcaoMenu == 1) {
                // Adição
                System.out.println("Resultado da adição: " + (numero1 + numero2));
            } else if (opcaoMenu == 2) {
                // Subtração
                System.out.println("Resultado da subtração: " + (numero1 - numero2));
            } else if (opcaoMenu == 3) {
                // Multiplicação
                System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
            } else if (opcaoMenu == 4) {
                // Divisão, com tratamento para divisão por zero
                if (numero2 != 0) {
                    System.out.println("Resultado da divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            } else if (opcaoMenu == 9) {
                // Sair do programa
                System.out.println("Encerrando o programa...");
            } else {
              // Opção inválida
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
    }
}
             
