public class Pessoa {

    private String nome;
    private int idade;
 
    public Pessoa(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
    }
 
    public int retornaIdade() {
       return idade;
    }
 
    public String retornaNome() {
       return nome;
    }
 }