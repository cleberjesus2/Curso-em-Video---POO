package ProjetoFinalpt1;

public class Video implements AcoesVideos{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
    System.out.println("O vídeo " + getTitulo() + " está passando");
        setViews(getViews() + 1);
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            System.out.println("O vídeo " + getTitulo() + " foi pausado");
            this.curtidas ++;
        } else {
            System.out.println("Não é possível pausar o vídeo, não está passando ");
        }
    }

    @Override
    public void like() {
        System.out.println("O video " + getTitulo() + " foi curtido");
        setCurtidas(getCurtidas() + 1);

        System.out.println("TOTAL DE CURTIDAS: ");
        System.out.println( getCurtidas());
    }
}
