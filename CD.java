public class CD {
    private int nMusicas;
    private double preco;
    private String titulo;
    private int duracao;

    public CD() {
        
    }

    public CD(int musicas, double preco, String titulo, int duracao) {
        this.nMusicas = musicas;
        this.preco = preco;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return "Título: " + titulo + ", Preço: " + preco + ", Duração: " + duracao + " minutos, Músicas: " + nMusicas;
    }

    public void setMusicas(int musicas) {
        this.nMusicas = musicas;
    }

    public void inserirDados() {
      
    }
}
