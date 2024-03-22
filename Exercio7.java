import java.util.Scanner;

/*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem dodistribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo */

public class Exercio7 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Double custoFabrica;
        Double custoConsumidor;
        Double porcentagemDistribuidor = 28.0;
        Double PercentualImpostos = 45.0;
        Double Destribuidor;
        Double ValorImpostos;

        System.out.println("Informe o custo de fábrica de um carro novo");
        double CustoFabrica = leitor.nextDouble();

        Destribuidor = (CustoFabrica * porcentagemDistribuidor) / 100.000;
        ValorImpostos = (CustoFabrica * PercentualImpostos) / 100;

        custoConsumidor = (Destribuidor + ValorImpostos);

        System.out.println("O custo ao consumidor de um carro novo é: " + custoConsumidor);
 
    }

}
