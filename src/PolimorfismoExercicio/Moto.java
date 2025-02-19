package PolimorfismoExercicio;

public class Moto extends Veiculo implements Automovel{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto está acelerando... ");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor da Moto está ligado...");
    }
}
