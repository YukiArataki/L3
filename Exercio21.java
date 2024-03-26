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

        String[] categorias = new String[]{"Infantil A","Infantil B","Juvenil A","Juvenil B","Sênior = 18","idade fora da faixa etária"};
        
        Nadador competidor = new Nadador();

        Prompt.separador();
        competidor.getIdade(Prompt.lerInteiro("Idade do competidor: "));
        Prompt.imprimir("Categoria: " + categorias[competidor.categoria]);
        Prompt.separador();

    }

}
