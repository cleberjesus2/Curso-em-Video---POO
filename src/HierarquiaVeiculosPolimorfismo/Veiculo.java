package HierarquiaVeiculosPolimorfismo;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  abstract void informacoes();

}
