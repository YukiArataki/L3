import java.util.Scanner;

/*8.Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9). */

public class Exercio8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        Double nota1, nota2, nota3, media;

        System.out.println("Digite seu nome: ");
        nome = leitor.next();

        System.out.print("Informe sua Primeira nota ");
        double n1 = leitor.nextDouble();

        System.out.println("Informe sua Segunda nota ");
        double n2 = leitor.nextDouble();

        System.out.println("Informe sua Terceira nota");
        double n3 = leitor.nextDouble();

        media = (n1 + n2 + n3)/2;
        System.out.println(nome + "Foi: " + media);

        if (media < 5.0) {

            System.out.println("Reprovado");
        }else if (media < 7.0) {

            System.out.println("Aprovado");
        }else {

            System.out.println("Recuperação");
        }
        

        

    }

}
