public class ConcreteProduto implements Produto{
    private double preco;
    private final String descricao;

    public ConcreteProduto(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
