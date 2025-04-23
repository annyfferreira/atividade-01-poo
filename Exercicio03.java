public class Exercicio03 {
    private double raio;
    private final double pi = 3.141516;

    public Exercicio03(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return pi * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * pi * raio;
    }

    public void imprimir() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
