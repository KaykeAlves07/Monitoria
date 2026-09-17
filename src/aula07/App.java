package aula07;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 07");

        Produto teclado = new Produto("Teclado", 150);
        Produto mouse = new Produto("Mouse", 80);

        ItemPedido itemTeclado = new ItemPedido(teclado, 2);
        ItemPedido itemMouse = new ItemPedido(mouse, 1);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(itemMouse);
        pedido.adicionarItem(itemTeclado);

        System.out.printf("Subtotal do teclado: %.2f\n", itemTeclado.calcularSubtotal());
        System.out.printf("Subtotal do mouse: %.2f\n", itemMouse.calcularSubtotal());
        System.out.printf("Total: %.2f\n", pedido.calcularTotal());

        System.out.println(new Pedido().calcularTotal());
    }
}
