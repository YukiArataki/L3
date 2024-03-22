import java.util.Scanner;

/*4.Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor lido em dólar (US$). 
O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário */

public class Exercio4 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        Double contacao_dolar, valor_dolar, valor_real;

        System.out.print("Conversor de Dólar em real\n\n");

        System.out.print("Digite a cotação do dolar: ");
        contacao_dolar = leitor.nextDouble();

        System.out.print("Digite o valor em dolar: ");
        valor_dolar = leitor.nextDouble();

        valor_real = contacao_dolar * valor_dolar;

        System.out.print("O valor em reais é " + valor_real + "\n");
    }

}
