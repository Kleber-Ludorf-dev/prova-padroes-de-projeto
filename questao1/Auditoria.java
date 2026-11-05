package questao1;

public class Auditoria implements Observador {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[Auditoria] Estoque alterado: " + nomeProduto
                + " -> " + novaQuantidade + " un.");
    }
}