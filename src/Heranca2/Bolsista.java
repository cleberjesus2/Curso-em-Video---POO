package Heranca2;

public final class Bolsista extends  Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("A Mensalidade do Bolsista " + getNome() + " do curso " + getCurso() + " foi paga :)"  );
        System.out.println();
        System.out.println("Total: " + getMatricula());
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
