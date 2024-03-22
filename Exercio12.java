import java.util.Scanner;

/*12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
O desconto deverá ser calculado de acordo com o ano do veículo. 
Até 2000- 12% e acima de 2000 - 7%. 
O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral. */

public class Exercio12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valor_carro, valor_desconto, valor_carro_desconto;
        double total_geral = 0.0;
        int ano, total_carros_ano_2000 = 0;   
        String lt; 
     
      System.out.print("Informe o valor do carro sem desconto: ");
      double Valor_carro = leitor.nextDouble();
       
      System.out.print("Informe o ano do carro: ");
      double Ano = leitor.nextDouble();
 
      if (Ano <= 2000) {
        valor_desconto = Valor_carro * (12.0 / 100.0);
        
        total_carros_ano_2000 = (total_carros_ano_2000 + 1);
      }
      else {
        valor_desconto = Valor_carro * (7.0 / 100.0);
      }
 
      valor_carro_desconto = (Valor_carro - valor_desconto);

      System.out.println("Desconto concedido: " + valor_desconto);
      System.out.println("Valor do carro com desconto: " + valor_carro_desconto);
 
      total_geral = (total_geral + valor_carro_desconto);

      System.out.println("Total de carros com ano até 2000: " + total_carros_ano_2000);
      System.out.println("Total geral a pagar: " + total_geral);
    
      System.out.println("Deseja usar a opção tal ? [S/N]");
      String Lt = leitor.nextLine();

      if (leitor.equals("Não")) {
      }else {
        System.out.println("Até logo");
      }
 
    }

}
