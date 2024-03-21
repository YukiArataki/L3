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

        Double idade;
        char letra;
        String categoria;

            do {

                System.out.print("Digite a idade do nadador: ");
                idade = leitor.nextDouble();
                if(idade < 5) System.out.println("Idade inválida.");
                
            }while (idade < 25);

            System.out.println();

            if (idade >= 5 && idade < 7) categoria = "Infantil A";
            else if(idade >= 8 && idade < 10) categoria = "Infantil B";
            else if(idade >= 11 && idade < 13) categoria = "Juvenil A";
            else if(idade >= 14 && idade < 17) categoria = "Juvenil B"; 
            else categoria = "Senior";

            System.out.println("A categoria é:" + categoria);

            System.out.println("Idade está fora da faixa etária");

    }

}
