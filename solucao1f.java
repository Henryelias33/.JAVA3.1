import javax.swing.JOptionPane;
public class solucao1f {
 public static void main(String[] args) {
   //informações de 20 pessoas: Nome, idade, sexo
     String[][] pessoas = {
     {"joão", "25", "M"},
     {"Ana", "30", "F"},
     {"Carlos", "22", "F"},
     {"Maria", "19", "F"},
     {"Pedro", "28", "M"},
     {"Lucas", "18", "M"},
     {"José", "24", "M"},
     {"Fernanda", "23", "F"},
     {"Paulo", "20", "M"},
     {"Mariana", "27", "F"},
     {"Felipe", "26", "M"},
     {"Camila", "29", "F"},
     {"Rafael", "17", "M"},
     {"Gabriel", "32", "M"},
     {"Beatriz", "21", "F"},
     {"Ricardo", "35", "M"},
     {"Thiago", "40", "M"},
     {"Juliana", "34", "F"},
     {"Gustavo", "23", "M"},
     {"Renata", "22", "F"}
     
   };
   
    //Homens com mais de 21 imprime
    for (int i = 0; i <pessoas.length; i++) {
      String nome = pessoas[i][0];
      int idade = Integer.parseInt(pessoas[i][1]);
      String sexo = pessoas[i][2];
      
      if (sexo.equals("M") && idade > 21) {
      System.out.println(nome);
      }
    }
   }
 }