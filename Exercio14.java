import java.util.Scanner;

/*14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. 
Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço decusto e do preço 
de venda.*/

public class Exercio14 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int totalProdutos = 40;

        for (int i = 1; i <= totalProdutos; i++) {
            System.out.println("Digite o preço de custo do produto " + i + ":");
            double precoCusto = leitor.nextDouble();
            somaPrecoCusto += precoCusto;

            System.out.println("Digite o preço de venda do produto " + i + ":");
            double precoVenda = leitor.nextDouble();
            somaPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaPrecoCusto = somaPrecoCusto / totalProdutos;
        double mediaPrecoVenda = somaPrecoVenda / totalProdutos;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        leitor.close();

    }
}
