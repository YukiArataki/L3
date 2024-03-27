import java.util.Scanner;

/*19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma doscomprimentos dos outros dois lados.
Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. 
Portanto, todotriângulo equilátero é também isóscele;
Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes. */

public class Exercio19 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo:");
        int lado1 = leitor.nextInt();

        System.out.println("Digite o comprimento do segundo lado do triângulo:");
        int lado2 = leitor.nextInt();

        System.out.println("Digite o comprimento do terceiro lado do triângulo:");
        int lado3 = leitor.nextInt();

        if (isTriangulo(lado1, lado2, lado3)) {
        
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isóscele.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        leitor.close();
    }

    public static boolean isTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }

}
