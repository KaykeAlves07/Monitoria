package aula09;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<ItemPedido> itens;
    private boolean fechado;

    public Pedido(){
        itens = new ArrayList<>();
        fechado = false;
    }

    public void adicionarItem(Produto produto, int quantidade){
        if(!fechado){
            ItemPedido item = new ItemPedido(produto, quantidade);
            itens.add(item);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item: itens){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void fechar(){
        fechado = true;
    }
}
