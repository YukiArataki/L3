import java.util.Scanner;

/*23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. 
Calcule e mostrenome e o seu peso ideal de acordo com as seguintes características da pessoa: */

public class Exercio23 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = leitor.nextLine();

        System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
        char sexo = leitor.next().toUpperCase().charAt(0);

        System.out.println("Digite a altura da pessoa em metros:");
        double altura = leitor.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = leitor.nextInt();

        double pesoIdeal;
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else { 
            if (altura <= 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        }

        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        leitor.close();

    }

}
