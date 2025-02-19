package Polimorfismo1Pratica;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.reagir("toma comida");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(45,11);
        cachorro.reagir(00,22);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5F);
    }
}
