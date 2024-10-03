public class solucao1j {
    public static void main(String[] args) {
        int[] votos = new int[4];  
        int totalVotos = 0;
        int voto;

        do {
            voto = gerarVotoExemplo();  // Função que simula a entrada de voto
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;  // Incrementa o voto para o candidato correspondente
                totalVotos++;
            } else if (voto != -1) {
                System.out.println("Voto inválido. Digite um número entre 1 e 4, ou -1 para encerrar.");
            }
        } while (voto != -1);

        // Exibe o percentual de votos de cada candidato
        if (totalVotos > 0) {
            System.out.println("Resultado da eleição:");
            for (int i = 0; i < 4; i++) {
                double percentual = (double) votos[i] / totalVotos * 100;
                System.out.printf("Candidato %d: %.2f%% dos votos\n", i + 1, percentual);
            }
            System.out.println("Total de alunos eleitores: " + totalVotos);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }
    }

    // Função para simular a entrada de votos (exemplo)
    public static int gerarVotoExemplo() {
        // Substituir esta função por um mecanismo real de entrada ou teste com valores fixos
        return (int) (Math.random() * 6) - 1;  
    }
}
