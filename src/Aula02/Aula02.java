package Aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.destampar();

        c1.status();
        c1.rabiscar();
        System.out.println("-------------------------");
        System.out.println("Caneta Vermelha");
        // c2.cor = "Vermelha";
        // c2.ponta = 1f;



        // c2.status();

    }
}
