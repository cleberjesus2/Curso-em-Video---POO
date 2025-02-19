package Aula07UEC;

import java.util.Random;

public class Luta implements ILuta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2){
           aprovada = true;
           this.desafiado = lutador1;
           this.desafiante = lutador2;
            System.out.println("Luta Aprovada");

        } else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    @Override
    public void lutar() {
        if (aprovada == true){

            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: // Desafiante Vence
                    System.out.println(this.desafiante + " Venceu");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                case 3: // Desafiado Vence
                    System.out.println(this.desafiado + " Venceu ");
                    desafiado.ganharLuta();
                    desafiado.perderLuta();
                    break;

            }

        } else{
            System.out.println("A luta não pode acontecer ! ");
        }
    }
}
