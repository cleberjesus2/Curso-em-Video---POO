package ExemploPratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;




    public ContaBanco(String nomeDono){
        this.dono = nomeDono;
        saldo = 0;
        status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
             this.tipo = tipo;
        status = true;
        if(tipo == "CC"){
            setSaldo(50);
            System.out.println("Conta Aberta ! Seu tipo de Conta Será CC - Conta Corrente e você receberá 50R$  ");
        } else if (tipo == "CP") {
            setSaldo(150);
            System.out.println("Conta Aberta ! Seu tipo de Conta Será CP - Conta Poupança e você receberá 150R$  ");
        } else {
            System.out.println(" 'ERRO' Digite novamente 'CP' para Conta Poupança ou 'CC' para Conta Corrente ");
        }
    }

    public void fecharConta() {
        if (saldo == 0 && status == true){
            System.out.println("Conta Fechada com Sucesso ");
            status = false;
        } else if (status == false) {
            System.out.println("A conta já está fechada !");
        } else{
            System.out.println(" A conta ainda possui saldo, não é possível fecha-lá");
        }
    }

    public void depositar(double saldo){
        if (status == true) {
            setSaldo(saldo);
            System.out.println(saldo + " Foi depositado em sua Conta !");
        } else{
            System.out.println("Sua Conta está Fechada.");
        }
    }

    public void sacar(double saldoSaque){
        if (status == true && saldoSaque <= saldo){
            setSaldo(this.saldo - saldoSaque);
            System.out.println("Saque Aprovado");
        } else if (status == false) {
            System.out.println("A conta está fechada, não é possível realizar Transações no momento ! ");
        } else{
            System.out.println("Dinheiro Insuficiente para o Saque !");
        }

    }

    public void pagarMensal(){

         if (this.tipo == "CC"){
          setSaldo(this.saldo -= 12 );
            System.out.println("Seu tipo de Conta é Conta Corrente o Valor pago da Mensalidade foi: 12R$ " );
        } else if (this.tipo == "CP") {
             setSaldo(this.saldo -= 20);
             System.out.println("Seu tipo de Conta é Conta Poupança o Valor pago da Mensalidade foi: 20R$ " );
        } else if (status == false){
             System.out.println("Sua conta está fechada");
         }

         if (saldo < 0){
             System.out.println("Você pagou sua Mensalidade e agora seu saldo esta Negativo ! Não Acumule ");
         }

    }

    public void exibirDados(){
        System.out.println("----------------------------------------------");
        System.out.println("Conta do Dono: " + this.dono);
        System.out.println("Numero da Conta: " + this.numConta);
        System.out.println("Tipo da Conta: " + this.tipo);
        System.out.println("Saldo da Conta: " + this.saldo);
        System.out.println("Status da Conta: "+ this.status);
        System.out.println("-----------------------------------------------");
    }



}
