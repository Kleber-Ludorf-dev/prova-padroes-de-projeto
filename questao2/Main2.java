package questao2;

public class Main2 {
    public static void main(String[] args) {
        int tempo = 135; // 2h15

        Ticket ticket = new Ticket("ABC-1234", tempo, new Rotativo());
        System.out.println("Placa: " + ticket.getPlaca() + " | Tempo: " + tempo + " min");

        System.out.printf("Rotativo: R$ %.2f%n", ticket.calcularValor());

        ticket.setRegra(new Mensalista());
        System.out.printf("Mensalista: R$ %.2f%n", ticket.calcularValor());

        ticket.setRegra(new Conveniado());
        System.out.printf("Conveniado: R$ %.2f%n", ticket.calcularValor());

        System.out.println();
        System.out.println("--- Trocando o perfil do mesmo tíquete ---");
        Ticket outro = new Ticket("XYZ-9876", 90, new Rotativo());
        System.out.printf("Antes (Rotativo): R$ %.2f%n", outro.calcularValor());
        outro.setRegra(new Conveniado());
        System.out.printf("Depois (Conveniado): R$ %.2f%n", outro.calcularValor());
    }
}