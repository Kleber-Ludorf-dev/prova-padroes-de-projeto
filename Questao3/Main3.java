package questao3;

public class Main3 {
    public static void main(String[] args) {
        // Pedido 1: Espresso com Leite
        Bebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        imprimir(1, pedido1);

        // Pedido 2: Chá com Chantilly e Calda
        Bebida pedido2 = new Cha();
        pedido2 = new Chantilly(pedido2);
        pedido2 = new Calda(pedido2);
        imprimir(2, pedido2);

        // Pedido 3: Espresso com Leite repetido e Chantilly
        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        imprimir(3, pedido3);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n",
                numero, pedido.getDescricao(), pedido.getPreco());
    }
}