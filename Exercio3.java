import java.util.Scanner;

/*3.Escrever um programa que leia o nome de um vendedor, o seu salário fixo e 
o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o seu nome, o salário fixo e salário no final do mês. */

public class Exercio3 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        String nome;
        Double salario, vendas, total;

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite o seu salário: ");
        salario = leitor.nextDouble();

        System.out.println("Digite suas vendas: ");
        vendas = leitor.nextDouble();

        total = salario + vendas * 0.15;

        System.out.println("Total: " + total);
        
    }

}
