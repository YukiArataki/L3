import java.util.Scanner;

/*9.Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive). */

public class Exercio9 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int numero = leitor.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);

        leitor.close();
    }
}
