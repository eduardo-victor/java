public class Lanche {
    private String nome;
    private Double price;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Lanche(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }
    public Lanche(){

    }
}
