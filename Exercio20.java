import java.util.Scanner;

/*20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
Faça um programaque calcule e exiba o salário de um professor. 
Sabe-se que o valor da hora/aula segue a tabela
abaixo:
Professor Nível 1 R$12,00 por hora/aula
Professor Nível 2 R$17,00 por hora/aula
Professor Nível 3 R$25,00 por hora/aula */


public class Exercio20 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = leitor.nextInt();

        System.out.println("Digite a quantidade de horas/aula trabalhadas:");
        int horasAula = leitor.nextInt();

        double valorHoraAula;
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido!");
                return;
        }

        double salario = valorHoraAula * horasAula;

        System.out.println("O salário do professor é: R$" + salario);

        leitor.close();

    }
}
