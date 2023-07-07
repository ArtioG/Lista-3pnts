public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
        
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        
    }
}
