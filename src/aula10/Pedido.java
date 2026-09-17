package aula10;

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
            
            // adicional
            if(buscarIndice(produto) != -1) return; 
            //

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

    // Pra não ficar repetindo o mesmo for em métodos diferentes
    private int buscarIndice(Produto p){
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).verificaProduto(p)) return i;
        }
        return -1;
    }

    public void removerItem(Produto p){
        if(!fechado){
            int indice = buscarIndice(p);

            if(indice != -1) itens.remove(indice);
        }
    }

    // itens.get(i).verificaProduto ==
    // ItemPedido item = itens.get(i) -> item.verificaProduto
    public void alterarQuantidade(Produto p, int qtdNova){
        if(!fechado){
            int indice = buscarIndice(p);

            if(indice != -1){
                if(qtdNova == 0) itens.remove(indice);
                else itens.get(indice).alterarQuantidade(qtdNova);
            }
        }
    }

    // public void removerItem(Produto p){
    //     if(!fechado){
    //         for(int i = 0; i < itens.size(); i++){
    //             ItemPedido item = itens.get(i);

    //             if(item.verificaProduto(p)){
    //                 itens.remove(i);
    //                 return;
    //             }
    //         }
    //     }
    // }

    // public void alterarQuantidade(Produto p, int qtdNova){
    //     if(!fechado){
    //         for(int i = 0; i < itens.size(); i++){
    //             ItemPedido item = itens.get(i);

    //             if(item.verificaProduto(p)){
    //                 if(qtdNova == 0) itens.remove(i);
    //                 else item.alterarQuantidade(qtdNova);
    //                 return;
    //             }
    //         }
    //     }
    // }
}

// Por que não usar For-each? Como não tem acesso ao índice, itens.remove(item)
//                            precisa varrer a lista novamente, fazendo o trabalho ser "dobrado";

// for(ItemPedido item: itens){
//     if(item.verificaProduto(p)) {
//         itens.remove(item);
//         return;
//     }
// }
