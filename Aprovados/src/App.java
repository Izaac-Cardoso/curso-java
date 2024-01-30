import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Quantos alunos serao digitados? ");
      int n = input.nextInt();
      
      Aluno[] alunos = new Aluno[n];

      for(int i = 0; i < alunos.length; i++) {
         System.out.println("Digite nome, primeira e segunda nota do " + i + "º aluno:");
         String nome = input.nextLine();
         double n1 = input.nextDouble();
         double n2 = input.nextDouble();

	     alunos[i] = new Aluno(nome, n1, n2);
        }

      System.out.print("Alunos aprovados:\n");

      for(Aluno elemento : alunos) {
         elemento.retornaNome();
        }

      input.close(); 
   }
}
