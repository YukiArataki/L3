import java.util.Scanner;

/*11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é
homem ou mulher. No final informe total de homens e de mulheres. */

public class Exercio11 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String nome, sexo;
        Short homem = 0, mulher = 0;

        for (int i = 0; i <= 6; i++) {

            System.out.println("Informe o seu nome: ");
            nome = leitor.next();

            System.out.println("Informe seu sexo M/F");
            sexo = leitor.next();

            System.out.println(sexo + "Antes");
            if (sexo.equals("M")  || sexo.equals("m") ) {

                System.out.println("Seu nome é" + nome + "e voce é homem");
                homem++;
            }else 
            if (sexo.equals ("F") || sexo.equals("f")) {

                System.out.println("Seu nome é" + nome + "e voce é mulher");
                mulher++;
        }
    }
     System.out.println("Homens: " + homem);
     System.out.println("Mulheres: " + mulher);
}
}
