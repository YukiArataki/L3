import java.util.Scanner;

/*18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. 
Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade: */


public class Exercio18 {

    public static void executar() {

        Abono funcionario1 = new Abono();

        funcionario1.getNome(Prompt.lerLinha("Nome:"));
        funcionario1.getIdade(Prompt.lerInteiro("Idade:"));
        funcionario1.getSexo(Prompt.lerCaractere("Sexo:"));
        funcionario1.getSalarioFixo(Prompt.lerDecimal("Salário fixo:"));
        funcionario1.salarioLiquido = funcionario1.calcSalarioLiquido(funcionario1.abono);
        Prompt.separador();
        Prompt.imprimir("Nome: " + funcionario1.nome + "\nSalário liquido: R$" + funcionario1.salarioLiquido);
        Prompt.separador();

    }

}
