package Heranca2;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade do Aluno " + getNome() + " do curso " + getCurso() + " foi paga :)");
    }


    public void exibirInfo() {
        System.out.println( getNome() +
                "Sexo=" + getSexo() +
                "Idade=" + getIdade() +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}');
    }
}
