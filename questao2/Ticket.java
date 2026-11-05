package questao2;

public class Ticket {
    private String placa;
    private int minutos;
    private RegraCobranca regra;

    public Ticket(String placa, int minutos, RegraCobranca regra) {
        this.placa = placa;
        this.minutos = minutos;
        this.regra = regra;
    }

    public void setRegra(RegraCobranca regra) {
        this.regra = regra;
    }

    public double calcularValor() {
        return regra.calcular(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }
}
