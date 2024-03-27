import java.util.Scanner;

/*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário.*/

public class Exercio6 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = leitor.nextDouble();

        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = leitor.nextDouble();

        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);

        System.out.println("Valor de venda: R$" + valorVenda);

        leitor.close();

    }

}
