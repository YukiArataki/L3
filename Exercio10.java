import java.util.Scanner;

/*10.Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem 
informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18 anos como maior de idade. */

public class Exercio10 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {

            System.out.println("Digite a idade da pessoa: ");
        int idade = leitor.nextInt(); 

        if (idade >= 18) {

            System.out.println("Essa pessoa é maior de idade.");
        }else{

            System.out.println("Essa pessoa é menor de idade.");
        } 

        }

        leitor.close();
    }

}
