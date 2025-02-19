package Pratica;

public class ContaEnergia {
    private String nomeCliente;
    protected int consumo;
    private double valorPorKwh;
    private double total;

    public ContaEnergia(String nomeCliente, int consumo, double valorPorKwh){
        this.nomeCliente = nomeCliente;
        this.consumo = consumo;
        this.valorPorKwh = valorPorKwh;

    }

    public void exibirConta(){
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Consumo: " + this.consumo);
        System.out.println("Valor por Kwh: " + this.valorPorKwh);
        System.out.println("Total da Conta: " + this.total);
    }

    private void calcularTotal(){
           total = consumo * valorPorKwh;
    }

    protected void atualizarConsumo(int novoConsumo){
       this.consumo = novoConsumo;
       calcularTotal();
    }

    public double obterTotal(){
       return this.total;
    }


}
