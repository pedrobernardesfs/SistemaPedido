public class ItemPedido {

    private produto produto;
    private int quantidade;
    public ItemPedido(produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
public Produto getProduto() {
    return produto;
}
public int getQuantidade() {
    return quantidade;
}

public void setQuantidade (int quantidade) {
    if (quantidade > 0) {
    this.quantidade = quantidade;
    }
}
}
