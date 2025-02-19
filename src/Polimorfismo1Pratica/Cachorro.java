package Polimorfismo1Pratica;

public class Cachorro extends Lobo{

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU !AU !AU !");
    }

    public void reagir(String frase){
        if (frase == "toma comida"  || frase == "Olá"){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int min, int hora){
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar e Latir");
        }

    }

    public void reagir(int idade, float peso){
        if(idade < 10){
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
        }

        if (peso< 10){
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }

}
