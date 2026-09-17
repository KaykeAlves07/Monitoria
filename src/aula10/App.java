package aula10;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 10");
        
        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        // Incremento B
        Pedido pedido = new Pedido();
        pedido.adicionarItem(teclado, 2);
        pedido.adicionarItem(mouse, 1);
        pedido.removerItem(mouse);
        System.out.println("2 teclados: " + pedido.calcularTotal());

        // Incremento C
        pedido.adicionarItem(mouse, 1);
        pedido.alterarQuantidade(teclado, 3);
        System.out.println("3 teclados e 1 mouse: " + pedido.calcularTotal());

        pedido.alterarQuantidade(mouse, 0);
        System.out.println("3 teclados: " + pedido.calcularTotal());

        pedido.alterarQuantidade(teclado, -3);
        System.out.println("3 teclados: " + pedido.calcularTotal());

        // Incremento D
        Pedido fechado = new Pedido();
        fechado.adicionarItem(teclado, 2);
        fechado.adicionarItem(mouse, 1);
        fechado.fechar();

        fechado.removerItem(mouse);
        fechado.alterarQuantidade(teclado, 3);
        fechado.adicionarItem(mouse, 2);

        System.out.println("Item fechado: " + fechado.calcularTotal());

        // Adicional
        Pedido p2 = new Pedido();
        p2.adicionarItem(teclado, 2);
        p2.adicionarItem(teclado, 1);
        System.out.println(p2.calcularTotal());
    }
}
