package aula06;

public class ItemPedido {
    private Produto produto; // Produto é o tipo e produto é a variavel
    private int quantidade = 0;

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


    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
}
