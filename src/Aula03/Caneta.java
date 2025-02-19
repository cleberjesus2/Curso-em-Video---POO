package Aula03;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;

   public void escrever(){

   }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO");
        } else{
            System.out.println("Rabisco");
        }
    }

    public void pintar(){

    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga );
        System.out.println("Esta tampada? " + this.tampada);
    }

}
