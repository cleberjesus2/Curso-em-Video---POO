package ExemploPratico9;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(int totPaginas, String autor, String titulo, int pagAtual, Pessoa leitor ) {
        this.totPaginas = totPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.aberto = aberto;
        this.pagAtual = pagAtual;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Nome do Livro: " + getTitulo() );
        System.out.println("Autor: " + getAutor());
        System.out.println("Pagina Atual: " + getPagAtual());
        System.out.println("Aberto: " + getAberto());
        System.out.println("Leitor: " + leitor.getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro Aberto");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro Fechado ");
    }

    @Override
    public void folhear(int folhear) {
        if (aberto){
            this.setPagAtual(getPagAtual() + folhear);
        } else {
            System.out.println("Livro Fechado");
        }
    }

    @Override
    public void avancarPag() {
        if (aberto){
        setPagAtual(getPagAtual() + 1);
        } else {
            System.out.println("Livro Fechado");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto){
            setPagAtual(getPagAtual() - 1);
        } else {
            System.out.println("Livro Fechado");
        }
    }
}
