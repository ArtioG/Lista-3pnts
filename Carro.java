public class Carro {
    private double km;
    private final String nome;
    private final double preco;

    public Carro(String nome, double preco, double km) {
        this.nome = nome;
        this.preco = preco;
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
    }

    int getKm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPreco(double novoPreco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
