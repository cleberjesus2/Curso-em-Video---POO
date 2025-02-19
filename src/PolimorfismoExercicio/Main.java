package PolimorfismoExercicio;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Palio", 2004);

        carro.ligarMotor();
        carro.acelerar();
        carro.exibirDetalhes();
    }
}
