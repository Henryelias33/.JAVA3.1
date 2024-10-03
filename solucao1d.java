import javax.swing.JOptionPane;
public class solucao1d {
  public static void main(String[] args) {
     // Defina o número para o qual deseja calcular o fatorial
     int numero = 5; 
     // Variável para armazenar o resultado   
     long fatorial = 1; 

        for (int i = 1; i <= numero; i++) {
            fatorial *= i; 
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}