public class Main06 {
    public static void main(String[] args) {
        Exercicio06 data1 = new Exercicio06(15, 3, 2024);
        Exercicio06 data2 = new Exercicio06(10, 10, 2023);

        System.out.println("Data 1:");
        data1.mostrarData();
        data1.anoBissexto();

        System.out.println("\nData 2:");
        data2.mostrarData();
        data2.anoBissexto();
    }
}