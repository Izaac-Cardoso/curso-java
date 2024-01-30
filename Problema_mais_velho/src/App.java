
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();
  
        Pessoa[] pessoas = new Pessoa[n];
  
        for(int i = 0; i < pessoas.length; i++) {
           System.out.println("Dados da " + (i + 1) + "a pessoa:");
           System.out.print("Nome: ");
           String nome = input.nextLine();
  
           System.out.print(" ");
  
           input.nextLine();
           System.out.print("Idade: ");
           int idade = input.nextInt();
  
           pessoas[i] = new Pessoa(nome, idade);  
        }
  
        int maisVelho = pessoas[0].retornaIdade();
        String nomeMaisVelho = pessoas[0].retornaNome();
        int posicao = 0;
        
        for(int j = 1; j < pessoas.length; j++) {
            if(pessoas[j].retornaIdade() > maisVelho) {
               maisVelho = pessoas[j].retornaIdade();
               posicao = j; 
             }       
         }
  
        nomeMaisVelho = pessoas[posicao].retornaNome();
        
        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
        input.close();
   }
}
