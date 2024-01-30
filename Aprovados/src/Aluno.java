public class Aluno {

    private String nome;
    private double n1, n2;
 
    public Aluno(String nome, double n1, double n2) {
       this.nome = nome;
       this.n1 = n1;
       this.n2 = n2;
    }
 
    public double media() {
       return (n1 + n2) / 2;
    }  
 
    public void retornaNome() {
       if(media() > 6) {
         String aprovado = this.nome;
         System.out.print(aprovado);
       }      
    }
 }