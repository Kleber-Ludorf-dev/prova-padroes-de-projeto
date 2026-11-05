package questao2;

public class Conveniado implements RegraCobranca {
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.0;
    private static final double DESCONTO = 0.25; // 25%

    @Override
    public double calcular(int minutos) {
        if (minutos <= MINUTOS_GRATIS) {
            return 0.0;
        }
        int minutosCobrados = minutos - MINUTOS_GRATIS;
        int horas = (minutosCobrados + 59) / 60;
        double valor = horas * VALOR_HORA;
        return valor - (valor * DESCONTO);
    }
}
