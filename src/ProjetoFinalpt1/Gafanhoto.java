package ProjetoFinalpt1;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;


    public Gafanhoto(String nome, String sexo, int idade, String login ) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
        System.out.println(login + " viu mais um vídeo");

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
