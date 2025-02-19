package HierarquiaVeiculosPolimorfismo;

public class Moto extends Veiculo{
     protected String tipo;



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void informacoes() {
        System.out.println("MARCA: " + getMarca());
        System.out.println("MODELO: " + getModelo());
        System.out.println("TIPO: " + getTipo());
    }
}
