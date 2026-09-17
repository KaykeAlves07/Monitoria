package aula08;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

            // public void adicionarItem(ItemPedido item){
            //     itens.add(item);
            // }
    // Lab 8:
    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item: itens){
            total += item.calcularSubtotal();
        }
        return total;
    }
}
