import java.util.Scanner;

/*16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde acordo com os 
seguintes critérios:
a) 50% para aqueles que ganham menos do que três salários mínimos;
b) 20% para aqueles que ganham entre três até dez salários mínimos;
c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d) 10% para os demais funcionários. */

public class Exercio16 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        Double salarioMinimo = 1100.00; 

        for (int i = 1; i <= 584; i++) {
            System.out.println("Digite o salário do funcionário " + i + " em reais:");
            double salario = leitor.nextDouble();

            double novoSalario;
            if (salario < 3 * salarioMinimo) {
                novoSalario = salario * 1.5; 
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                novoSalario = salario * 1.2; 
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                novoSalario = salario * 1.15; 
            } else {
                novoSalario = salario * 1.1;
            }

            System.out.println("Novo salário do funcionário " + i + ": R$" + novoSalario);
        }

        leitor.close();

    }
}
