package ProjetoFinalpt1;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video videos [] = new Video[5];

        videos[0] = new Video("Roadmap Java 2025");

        videos[0].play();

       Gafanhoto gafanhoto [] = new Gafanhoto[5];

        gafanhoto[0] = new Gafanhoto("cleber", "Masculo", 16, "clebao");


        gafanhoto[0].viuMaisUm();

        Visualizacao visualizacao[] = new Visualizacao[3];

        visualizacao[0] = new Visualizacao(gafanhoto[0],videos[0]);



        System.out.println(visualizacao[0].toString());
    }
}
