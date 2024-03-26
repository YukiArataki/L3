import java.util.Scanner;

/*23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. 
Calcule e mostrenome e o seu peso ideal de acordo com as seguintes características da pessoa: */

public class Exercio23 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        PesoIdeal pessoa = new PesoIdeal();
        Prompt.separador();
        pessoa.getNome(Prompt.lerLinha("Nome:"));
        double x = 0;
        boolean flag;
        do{
            flag = false;
            pessoa.getSexo(Prompt.lerCaractere("Sexo(M/F)"));
            
            if(pessoa.sexo == 'm' || pessoa.sexo == 'M'){
                flag = true;
            }else if(pessoa.sexo == 'f' || pessoa.sexo == 'F'){
                flag = true;
            }else{
                Prompt.imprimir("Sexo inválido\nDigite novamente\n");
            }
        }while(flag == false);
        
        pessoa.getAltura(Prompt.lerDecimal("Altura:"));
        pessoa.getIdade(Prompt.lerInteiro("Idade:"));
        Prompt.separador();
        
        if(pessoa.sexo == 'm' || pessoa.sexo == 'M'){
            if(pessoa.altura > 1.7){

                if(pessoa.idade <= 20){
                    x = 58;
                }
                else if(pessoa.idade >= 21 && pessoa.idade <= 39){
                    x = 53;
                }
                else if(pessoa.idade >= 40){
                    x = 45;
                }

            }
            else if(pessoa.altura <= 1.7){

                if(pessoa.idade <= 40){
                    x = 50;
                }
                else if(pessoa.idade >40){
                    x = 58;
                }
            }
            pessoa.pesoIdeal = (72.7*pessoa.altura) - x;
        }
        else if(pessoa.sexo == 'f' || pessoa.sexo == 'F'){
            if(pessoa.altura > 1.5){
                x = 44.7;
            }
            else if(pessoa.altura <= 1.5){
                if(pessoa.idade >= 35){
                    x = 45;
                }
                else if(pessoa.idade < 35){
                    x = 49;
                }
            }
            pessoa.pesoIdeal = (62.1 * pessoa.altura) - x;
        }
        String txt = String.format("%.2f", pessoa.pesoIdeal).replace(",", ".");
        Prompt.imprimir("Nome: " + pessoa.nome);
        Prompt.imprimir("Peso ideal: \n" + txt + "Kg");
        Prompt.separador();

    }

}
