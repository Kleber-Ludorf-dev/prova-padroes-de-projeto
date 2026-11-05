package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void setQuantidade(int novaQuantidade) {
        // só avisa se a quantidade realmente mudou
        if (novaQuantidade == this.quantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(nome, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}