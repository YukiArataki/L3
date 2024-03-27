import java.util.Scanner;

/*26.  Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices deseguro. 
Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. 
Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. 
Caso aidade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadraem nenhuma das 
categorias ofertadas */

public class Exercio26 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = leitor.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
            return;
        }

        System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio, Alto):");
        String grupoRisco = leitor.next().toLowerCase();

        int categoriaSeguro = determinarCategoriaSeguro(idade, grupoRisco);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoriaSeguro);

        leitor.close();
    }

    public static int determinarCategoriaSeguro(int idade, String grupoRisco) { 
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    return 1;
                case "médio":
                    return 2;
                case "alto":
                    return 3;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    return 2;
                case "médio":
                    return 3;
                case "alto":
                    return 4;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    return 3;
                case "médio":
                    return 4;
                case "alto":
                    return 5;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    return 4;
                case "médio":
                    return 5;
                case "alto":
                    return 6;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    return 7;
                case "médio":
                    return 8;
                case "alto":
                    return 9;
            }
        }

        return -1; 

    }
}
