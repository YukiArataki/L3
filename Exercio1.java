import java.util.Scanner;

/*1.Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteveno semestre. 
No final informar o nome do aluno e a sua média (aritmética).*/

public class Exercio1 {

    public static void m(String[] args) {
        
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

        media = (n1 + n2 + n3)/4;
        System.out.println(nome + "obteve a media de: " + media);
    }

}
