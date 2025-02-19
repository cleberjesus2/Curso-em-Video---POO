package Aula07UEC;

public class Main {
    public static void main(String[] args) {
        Lutador lutador [] = new Lutador[6];

        lutador[0] = new Lutador("Pretty Boy ", "França", 31,1.75F,68.9F,11,3,1);

        lutador[1] = new Lutador("PutsScript", "Brasil", 29,1.68F,57.8F,14,2,3);

        lutador[2] = new Lutador("SnapShadow", "EUA", 35, 1.65F, 80.9F,12,2,1);


        Luta  uec01 = new Luta();

        uec01.marcarLuta(lutador[0], lutador[1]);

        uec01.lutar();




    }
}
