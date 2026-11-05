package questao2;

public class Rotativo implements RegraCobranca {
    private static final double VALOR_HORA = 8.0;

    @Override
    public double calcular(int minutos) {
        // hora iniciada: 61 min conta como 2 horas
        int horas = (minutos + 59) / 60;
        return horas * VALOR_HORA;
    }
}