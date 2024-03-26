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

        novoSeguro.getNome(Prompt.lerLinha("Nome: "));
        novoSeguro.getIdade(Prompt.lerInteiro("Idade:"));

        if(novoSeguro.idade < 17 || novoSeguro.idade > 70){
            Prompt.imprimir("não se enquadraem nenhuma das categorias ofertadas");
        }
        else{
            do{
                valido = false;

                novoSeguro.getGrupoRisco(Prompt.lerCaractere("Grupo de risco(Baixo - B / Médio - M / Alto - A):"));

                switch (novoSeguro.grupoRisco) {
                    case 'B':
                        valido = true;
                        break;
                    case 'M':
                        valido = true;
                        break;
                    case 'A':
                        valido = true;
                        break;
                    default:
                        Prompt.imprimir("Letrainválida\nDigite novamente");
                        break;
                }
            }while(valido == false);

            int idade = novoSeguro.idade, c = 0;

            switch (novoSeguro.grupoRisco) {
                case 'B':
                        if(idade >= 17 && idade <= 20){
                            c = 1;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 2;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 3;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 4;
                        }
                        else{
                            c = 7;
                        }
                    break;
                case 'M':
                        if(idade >= 17 && idade <= 20){
                            c = 2;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 3;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 4;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 5;
                        }
                        else{
                            c = 8;
                        }
                    break;
                case 'A':
                        if(idade >= 17 && idade <= 20){
                            c = 3;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 4;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 5;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 6;
                        }
                        else{
                            c = 9;
                        }
                    break;
                    
                }
                novoSeguro.defCategoria(c);
                Prompt.separador();
                Prompt.imprimir("Nome: " + novoSeguro.nome +"\nGrupo de Risco: " + novoSeguro.grupoRisco +"\nCategoria: " + novoSeguro.categoria);
                Prompt.separador();
            }


    }

}
