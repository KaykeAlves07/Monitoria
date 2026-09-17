package aula07;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
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
