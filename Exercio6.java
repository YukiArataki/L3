import java.util.Scanner;

/*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário.*/


public class Exercio6 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        double precoCusto;
        double valorVenda;
        double percAcrecimo;

        public void getCusto(double precoCusto){
            this.precoCusto = precoCusto;
        }
    
        public void getPercAcrec(double percAcrecimo){
            this.percAcrecimo = percAcrecimo;
        }
    
        public double calcValVenda(){
            return this.valorVenda =  this.precoCusto *(1 + (this.percAcrecimo / 100));
    

    }

}
