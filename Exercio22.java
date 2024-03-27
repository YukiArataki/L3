import java.util.Scanner;

/*22. Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculoda conta de luz segue 
a tabela abaixo:
Tipo de Cliente Valor do KW/h
1 (Residência) 0,60
2 (Comércio) 0,48
3 (Indústria) 1,29 */

public class Exercio22 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int tipoCliente = leitor.nextInt();

        System.out.println("Digite o consumo em KW/h:");
        double consumoKWh = leitor.nextDouble();

        double valorKWh;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        double valorConta = consumoKWh * valorKWh;

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        leitor.close();

    }

}
