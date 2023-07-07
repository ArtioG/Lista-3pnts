public class DVD {
    private int nFaixas;
    private double preco;
    private String titulo;
    private int duracao;

    public DVD() {
        
    }

    public DVD(int faixas, double preco, String titulo, int duracao) {
        this.nFaixas = faixas;
        this.preco = preco;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return "Título: " + titulo + ", Preço: " + preco + ", Duração: " + duracao + " minutos, Faixas: " + nFaixas;
    }

    public void setFaixas(int faixas) {
        this.nFaixas = faixas;
    }

    public void inserirDados() {
        
    }
}

