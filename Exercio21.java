import java.util.Scanner;

/*21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintescategorias:
Infantil A = 5 - 7 anos
Infantil B = 8 - 10 anos
juvenil A = 11- 13 anos
juvenil B = 14 - 17 anos
Sênior = 18 - 25 anos
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado. */

public class Exercio21 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = leitor.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador pertence à categoria Infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("O nadador pertence à categoria Infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("O nadador pertence à categoria Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador pertence à categoria Juvenil B.");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("O nadador pertence à categoria Sênior.");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }

        leitor.close();
    }

}
