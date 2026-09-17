package aula09;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 09");
        
        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        Pedido primeiro = new Pedido();
        primeiro.adicionarItem(teclado, 2);
        primeiro.fechar();
        primeiro.adicionarItem(mouse, 1);
        System.out.println(primeiro.calcularTotal());

        Pedido segundo = new Pedido();
        segundo.adicionarItem(mouse, 1);
        System.out.println(segundo.calcularTotal());

        // Adicional
        Pedido terceiro = new Pedido();
        terceiro.adicionarItem(teclado, 2);
        terceiro.adicionarItem(mouse, 1);
        terceiro.fechar();
        terceiro.adicionarItem(mouse, 1);
        System.out.println(terceiro.calcularTotal());
    }
}
