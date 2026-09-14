public class App {
    public static void main(String[] args) throws Exception {

        Produto teclado = new Produto("Teclado", 150);
        Produto mouse = new Produto("Mouse", 80);

        // produto -> pedido: App > produto + qtd.

        Pedido p2 = new Pedido();
        p2.adicionarItem(teclado, 2);
        p2.adicionarItem(mouse, 1);
    
        System.out.println(p2.calcularTotal());
    }
}
