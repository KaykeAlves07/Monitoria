package aula06;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("AULA 06");

        Produto teclado = new Produto("Teclado", 150);

        ItemPedido itemPrincipal = new ItemPedido(teclado, 2);
        ItemPedido itemObservado = itemPrincipal;
        ItemPedido itemIndependente = new ItemPedido(teclado, 1);

        System.out.println(itemPrincipal.getProduto().getDescricao());

        System.out.println("=== Subtotais ===");
        System.out.printf("itemPrincipal: %.2f\n", itemPrincipal.calcularSubtotal());
        System.out.printf("itemIndependente: %.2f\n", itemIndependente.calcularSubtotal());

        System.out.printf("itemPrincipal == itemObservado: %b\n", itemPrincipal == itemObservado);
        System.out.printf("itemPrincipal == itemIndependente: %b\n", itemPrincipal == itemIndependente);

        System.out.printf("teclado == itemPrincipal.getProduto(): %b\n", teclado == itemPrincipal.getProduto());
        System.out.printf("itemPrincipal.getProduto() == itemIndependente.getProduto(): %b\n", itemPrincipal.getProduto() == itemIndependente.getProduto());
        
        System.out.println();
        // Incremento D
        Produto outroTeclado = new Produto("Teclado", 150);
        ItemPedido itemOutroProduto = new ItemPedido(outroTeclado, 2);

        System.out.printf("teclado == outroTeclado: %b\n", teclado == outroTeclado);
        System.out.printf("itemPrincipal.getProduto() == itemOutroProduto.getProduto(): %b\n", itemPrincipal.getProduto() == itemOutroProduto.getProduto());
        System.out.printf("Subtotal: %.2f\n", itemOutroProduto.calcularSubtotal());
    }
}
