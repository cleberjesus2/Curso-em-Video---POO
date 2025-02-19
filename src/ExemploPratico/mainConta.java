package ExemploPratico;


public class mainConta {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco("Cleber Jesus");
        ContaBanco c2 = new ContaBanco("Marcos Lira");


        c1.abrirConta("CP");
        c1.sacar(90);

        c1.exibirDados();


    }
}
