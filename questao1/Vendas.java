package questao1;

import java.util.HashMap;
import java.util.Map;

public class Vendas implements Observador {
    // guarda quais produtos já zeraram
    private Map<String, Boolean> zerados = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            zerados.put(nomeProduto, true);
        } else if (zerados.containsKey(nomeProduto) && zerados.get(nomeProduto)) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto
                    + " voltou ao estoque (" + novaQuantidade + " un.)");
            zerados.put(nomeProduto, false);
        }
    }
}