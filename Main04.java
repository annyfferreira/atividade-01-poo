public class Main04 {
    public static void main(String[] args) {
        Exercicio04 fita1 = new Exercicio04("Matrix", 3.50);
        Exercicio04 fita2 = new Exercicio04("Vingadores", 4.00);
        Exercicio04 fita3 = new Exercicio04("O Rei Leão", 2.75);

        System.out.println(fita1.toString());
        System.out.println("Valor por 5 dias: R$ " + fita1.getValorAluguel(5));

        System.out.println("\n" + fita2.toString());
        System.out.println("Valor por 3 dias: R$ " + fita2.getValorAluguel(3));

        System.out.println("\n" + fita3.toString());
        System.out.println("Valor por 7 dias: R$ " + fita3.getValorAluguel(7));
    }
}