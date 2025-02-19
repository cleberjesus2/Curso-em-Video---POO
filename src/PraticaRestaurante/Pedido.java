package PraticaRestaurante;

public class Pedido implements IPedido{
    private int numeroPedido;
    private String item;
    private int quantidade;
    private double precoUnitario;

    public Pedido(int numeroPedido,String item, int quantidade, double precoUnitario ){
        this.numeroPedido = numeroPedido;
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    @Override
    public void exibirPedido() {
        System.out.println("Numero do Pedido: " + this.getNumeroPedido());
        System.out.println("Item: " + this.getItem());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Preço: " + this.getPrecoUnitario());
    }

    @Override
    public double calcularTotal() {
        return getQuantidade() * getPrecoUnitario();
    }
}
