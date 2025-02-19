package PolimorfismoExercicio;

public class Carro extends Veiculo implements Automovel{

    public Carro(String marca, String modelo, int ano) {
        super(marca,modelo,ano);

    }

    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando...");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro está ligado...");
    }
}
