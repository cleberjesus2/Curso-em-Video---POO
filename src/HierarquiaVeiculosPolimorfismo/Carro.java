package HierarquiaVeiculosPolimorfismo;

public class Carro extends Veiculo{
    protected int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }


    @Override
    public void informacoes(){
        System.out.println("MODELO: " + getModelo());
        System.out.println("MARCA: " + getMarca());
        System.out.println("NUMERO DE PORTAS: " + getNumeroPortas());

    }
}
