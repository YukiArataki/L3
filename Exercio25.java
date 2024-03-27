import java.util.Scanner;

/*25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acimamencionadas, 
desenvolva um programa para calcular a nota final e a classificação de cadaestudante. 
A classificação é dada conforme a lista abaixo:Nota Final Classificação
[8,10] A
[7,8] B
[6,7] C
[5,6] D
[0,5] R
Imprima o nome do estudante, com o seu número, nota final e classificação. */

public class Exercio25 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nomeEstudante = leitor.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int matricula = leitor.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaExameFinal = leitor.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        String classificacao = determinarClassificacao(notaFinal);

        System.out.println("Nome do estudante: " + nomeEstudante);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        leitor.close();
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
       
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }

    public static String determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }

    }

}
