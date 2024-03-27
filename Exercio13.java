import java.util.Scanner;

/*13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou não 
para cumprir o serviço militar obrigatório. Informe os totais. */

public class Exercio13 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int totalPessoas = 0;
        int totalAptas = 0;
        int totalInaptas = 0;

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = leitor.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            leitor.nextLine(); 

            System.out.println("Nome:");
            String nome = leitor.nextLine();

            System.out.println("Sexo (M para masculino, F para feminino):");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);

            System.out.println("Idade:");
            int idade = leitor.nextInt();

            System.out.println("Saúde (A para apto, I para inapto):");
            char saude = leitor.next().toUpperCase().charAt(0);

            if (sexo == 'M' && idade >= 18 && saude == 'A') {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptas++;
            }

            totalPessoas++;
        }

        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Total aptas para o serviço militar obrigatório: " + totalAptas);
        System.out.println("Total inaptas para o serviço militar obrigatório: " + totalInaptas);

        leitor.close();

    }

}
