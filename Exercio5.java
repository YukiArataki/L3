import java.util.Scanner;

/*5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */

public class Exercio5 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in); 

        double valordacompra;
        double valorparcelado;

        System.out.println("Informe o valor da compra: ");
        double valorDacompra = leitor.nextDouble();

        double valorParcelado = valorDacompra/5;

        System.out.println("O valor da parcela é de " + valorParcelado);

    }

}
