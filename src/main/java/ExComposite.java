public class ExComposite {
    public static void main(String[] args) {

        final var caixa = new CaixaProduto(1);

        caixa.addProduto(new ConcreteProduto(10, "Sapato"));
        caixa.addProduto(new ConcreteProduto(1000, "Celular"));
        caixa.addProduto(new ConcreteProduto(13.50, "Dinossauro"));
        caixa.addProduto(new ConcreteProduto(2.69, "Cerveja"));

        System.out.println(caixa.getPreco());

    }
}
