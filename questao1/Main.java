package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("--- Estoque para 8 ---");
        notebook.setQuantidade(8);

        System.out.println("--- Estoque para 3 ---");
        notebook.setQuantidade(3);

        System.out.println("--- Estoque para 0 ---");
        notebook.setQuantidade(0);

        System.out.println("--- Estoque para 0 de novo (nada deve acontecer) ---");
        notebook.setQuantidade(0);

        System.out.println("--- Estoque para 7 ---");
        notebook.setQuantidade(7);

        System.out.println("--- Removendo Compras ---");
        notebook.removerObservador(compras);

        System.out.println("--- Estoque para 2 (Compras não deve avisar) ---");
        notebook.setQuantidade(2);
    }
}