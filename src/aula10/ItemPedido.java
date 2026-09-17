package aula10;

public class ItemPedido {
    private Produto produto; // Produto é o tipo e produto é a variavel
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){ //Produto produto -> parametro que espera um Produto
        this.produto = produto;
        if(quantidade > 0) this.quantidade = quantidade;
    }

    double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    void aumentarQuantidade(int unidades){
        if(unidades >= 0) quantidade += unidades;
    }

    public boolean verificaProduto(Produto produto){
        return produto == this.produto;
    }

    public void alterarQuantidade(int quantidade){
        if(quantidade > 0) this.quantidade = quantidade;
    }
}
