package questao2;

public class Mensalista implements RegraCobranca {
    private static final double VALOR_MENSAL = 150.0;

    @Override
    public double calcular(int minutos) {
        return VALOR_MENSAL;
    }
}
