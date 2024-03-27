import java.util.Scanner;

/*17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
Calcule o seu novo salárioreajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. 
Calcule quanto àempresa vai aumentar sua folha de pagamento. */

public class Exercio17 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = leitor.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = leitor.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = leitor.nextDouble();

        double novoSalario = calcularNovoSalario(salarioFuncionario, salarioMinimo);

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + calcularReajuste(salarioFuncionario, salarioMinimo) + "%");
        System.out.println("Novo salário: R$" + novoSalario);

        double aumentoFolhaPagamento = novoSalario - salarioFuncionario;

        System.out.println("Aumento na folha de pagamento da empresa: R$" + aumentoFolhaPagamento);

        leitor.close();
    }

    public static double calcularReajuste(double salario, double salarioMinimo) {
        if (salario < 3 * salarioMinimo) {
            return 50;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return 20;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return 15;
        } else {
            return 10;
        }
    }

    public static double calcularNovoSalario(double salario, double salarioMinimo) {
        double reajuste = calcularReajuste(salario, salarioMinimo) / 100.0;
        return salario * (1 + reajuste);

    }
}
