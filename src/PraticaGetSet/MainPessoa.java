package PraticaGetSet;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Caio", "12");
        Pessoa pessoa2 = new Pessoa("Julia", "9");

        pessoa1.alterarNome("Pedro");
        pessoa2.alterarNome("Gabriela");

        pessoa1.exibirDados();
        pessoa2.exibirDados();
    }
}
