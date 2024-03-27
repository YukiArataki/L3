import java.util.Scanner;

/*8.Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9). */

public class Exercio8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Menção: Aprovado");
        } else if (media >= 5.1 && media <= 6.9) {
            System.out.println("Menção: Recuperação");
        } else {
            System.out.println("Menção: Reprovado");
        }

        leitor.close();
        
 }      

}

