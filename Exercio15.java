import java.util.Scanner;

/*15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível 
(álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. 
Informe total dedesconto e total pago pelos clientes.*/

public class Exercio15 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        ArrayList<CarangoNovo> lista = new ArrayList<CarangoNovo>();
        boolean valido;
        double aux;

        do{
            CarangoNovo carro = new CarangoNovo();

            carro.getPreco(Prompt.lerDecimal("Qual o preço do Carro: "));
            aux = carro.precoCarro;
            if(aux == 0){
                break;
            }
            do{
                valido = false;
                carro.getCombustivel(Prompt.lerCaractere("Qual o tipo de Combustivel:\nálcool(a)\ngasolina(g)\ndiesel(d)"));

                    valido = true;
                    if(carro.combustivel == 'a'){
                        carro.desconto = 0.25;

                    }else if(carro.combustivel == 'g'){
                        carro.desconto = 0.21;

                    }else if(carro.combustivel == 'd'){
                        carro.desconto = 0.14;

                    }else{
                        Prompt.imprimir("Combustível inválido");
                    }
                    
            }while(valido == false);
            
            carro.precoFinal = carro.precoCarro - (carro.precoCarro * carro.desconto);

               Prompt.imprimir("\nPara parar digite 0\n");    
               lista.add(carro);

        }while(true);

        Prompt.separador();
        int j = 1;
        for (CarangoNovo i : lista) {
            String td = String.format("%.0f", (i.desconto * 100));
            
            Prompt.imprimir("== Carro "+ j+" ==");
            Prompt.imprimir("Preço inicial: R$"+i.precoCarro);
            Prompt.imprimir("Tipo de Combustivel: ");
            if(i.combustivel == 'a'){
                Prompt.imprimir("Álcool");

            }else if(i.combustivel == 'g'){
                Prompt.imprimir("Gasolina");
            }else{
                Prompt.imprimir("Diesel");
            }

            Prompt.imprimir("Desconto: "+ (td) + "%");
            Prompt.imprimir("\n-->Preço final: R$"+ i.precoFinal);
            j++;
        }
        Prompt.separador();

    }

}
