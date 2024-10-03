public class solucao1h {
    public static void main(String[] args) {
        int quantidadeDePares = 4; /

        // Variável que irá armazenar o número par atual
        int numeroPar = 2;

        // Laço para imprimir a quantidade de números pares desejados
        for (int i = 0; i < quantidadeDePares; i++) {
            // Imprime o número par atual
            System.out.print(numeroPar + " ");
            
            // Incrementa o valor do número par em 2 para o próximo par
            numeroPar += 2;
        }
    }
}
