package Pratica;

public class MainContaEnergia {
    public static void main(String[] args) {
        ContaEnergia conta1 = new ContaEnergia("Pedro", 150,0.12);


        conta1.atualizarConsumo(300);


        conta1.exibirConta();
    }
}
