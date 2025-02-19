package HierarquiaVeiculosPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Moto moto1 = new Moto();

        car1.setModelo("Camaro");
        car1.setMarca("Chrevolet");
        car1.setNumeroPortas(4);

        car1.informacoes();

        moto1.setModelo("Fan 160");
        moto1.setMarca("Honda");
        moto1.setTipo("Casual");

        moto1.informacoes();


    }
}
