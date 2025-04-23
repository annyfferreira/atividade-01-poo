import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exercicio05 funcionario = new Exercicio05();
        funcionario.setCodigo(1);
        funcionario.setNome("Ana Costa");
        funcionario.setCpf("123.456.789-00");
        funcionario.setEndereco("Rua das Flores, 100");
        funcionario.setTelefone("99999-8888");
        funcionario.setIdade(30);
        funcionario.setSalario(3000.00f);

        System.out.println("=== Dados Iniciais do Funcionário ===");
        System.out.println(funcionario.toString());

        System.out.print("\nDigite o novo salário: R$ ");
        float novoSalario = scanner.nextFloat();
        funcionario.setSalario(novoSalario);

        float salarioLiquido = funcionario.calculaSalarioLiquido();

        System.out.println("\n=== Dados Atualizados ===");
        System.out.println(funcionario.toString());
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}