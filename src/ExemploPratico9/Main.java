package ExemploPratico9;

public class Main {
    public static void main(String[] args) {
        Pessoa  pessoa [] = new Pessoa [8];
        Livro livro [] = new  Livro[8];

        pessoa[0] = new Pessoa("Cleber", 16, "Masculino");
        livro[0] = new Livro(255,"Tom Tauli", "Introdução a IA", 55, pessoa[0]);


        livro[0].avancarPag();


        livro[0].detalhes();
    }
}
