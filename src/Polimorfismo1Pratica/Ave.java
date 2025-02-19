package Polimorfismo1Pratica;

public class Ave extends Animal{
    protected String corPeixe;

    public String getCorPeixe() {
        return corPeixe;
    }

    public void setCorPeixe(String corPeixe) {
        this.corPeixe = corPeixe;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho(){
        System.out.println("Construiu um Ninho");
    }
}
