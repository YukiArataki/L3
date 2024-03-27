import java.util.Scanner;

/*18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. 
Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */


public class Exercio18 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = leitor.nextInt();

        System.out.println("Digite o sexo do funcionário (M para masculino, F para feminino):");
        char sexo = leitor.next().toUpperCase().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = leitor.nextDouble();

        double abono;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else { 
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);

        leitor.close();
    }

}
