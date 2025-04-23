public class Exercicio04 {
    private String titulo;
    private double precoPorDia;

    public Exercicio04(String titulo, double precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Preço por dia: R$ " + precoPorDia;
    }
}