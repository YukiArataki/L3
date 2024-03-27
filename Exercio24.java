import java.util.Scanner;

/*24. Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas, 
respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um examefinal. As notas variam, de 0 a 10
 e a nota final é a média ponderada das três notas mencionadas.A lista abaixo fornece os pesos:
 a. Laboratório: peso 2
 b. Avaliação semestral: peso 3
 c. Exame final: peso 5 */

public class Exercio24 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaExameFinal = leitor.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        System.out.println("A nota final do estudante é: " + notaFinal);

        leitor.close();
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
     
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }

}
