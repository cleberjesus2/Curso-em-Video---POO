package Heranca2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        b1.setNome("Gabriel");
        b1.setIdade(21);
        b1.setBolsa(11);
        b1.setCurso("Eng. Software");
        b1.setMatricula(500);
        b1.pagarMensalidade();
        b1.fazerAniv();



//        a1.setNome("Cleber");
//        a1.setSexo("Masculino");
//        a1.setCurso("ADS");
//        a1.setMatricula(200);
//
//
//        a1.exibirInfo();
//        a1.pagarMensalidade();
    }
}
