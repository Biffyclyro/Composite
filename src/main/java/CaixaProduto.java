import java.util.ArrayList;
import java.util.List;

public class CaixaProduto implements Produto{
    private final double preco;
    private List<Produto> caixa = new ArrayList<>();

    public CaixaProduto(double preco) {
        this.preco = preco;
    }

    public void addProduto(Produto p){
        this.caixa.add(p);
    }

    @Override
    public double getPreco() {

        return this.caixa.stream().mapToDouble(Produto::getPreco).sum() + this.preco;
    }
}
