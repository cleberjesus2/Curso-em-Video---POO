package PraticaGetSet;

public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa(String nome, String idade){
           this.nome = nome;
           this.idade = idade;
    }

    public String Getnome(){
        return nome;
    }

    public void Setnome(String nome){
        this.nome = nome;
    }

    public String Getidade(){
        return idade;
    }

    public void SetIdade(String idade){
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }
}