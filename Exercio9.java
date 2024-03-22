import java.util.Scanner;

/*9.Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive). */


public class Exercio9 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int intervalo, num;

        System.out.println("Digite um números");
        num = leitor.nextInt();

        for (int i = 1; i <= 80; i++ ) {
            
            if(num >= 10 && num <= 150); 

        }

        System.out.println("Foram encontrados" + intervalo + "números nos intervalo entre 10 e 150");
    }

}
