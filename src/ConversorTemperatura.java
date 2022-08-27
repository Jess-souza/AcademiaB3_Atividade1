/* Enunciado
Criar uma função que transforma o valor de uma temperatura em graus celsius em fahrenheit seguindo a fórmula abaixo:
fahrenheit = (celsius * fator1) + fator2
fator1 deve ser representado pela divisão de 9 por 5
fator2 = 32
Tanto fator1 e fator2 de devem ser constantes.
celcius deve ser variável um valor variável.
O seu programa deve calcular o valor em fahrenheit de ao menos duas temperaturas distintas e deve imprimir o resultado no console.
*/

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        final double fator2 = 32;
        final double fator1 = 1.8;
        double fahrenheit;
        double celsius = 0;

        Scanner entradaDeDados = new Scanner(System.in);
        String Celsius;

        System.out.print("Digite a primeira temperatura em Celsius que será convertida: ");
        celsius = entradaDeDados.nextDouble();
        fahrenheit = (celsius * fator1) + fator2;
        System.out.println("A conversão de " + celsius + " graus Celsius em Fahrenheit é: " + fahrenheit);

        System.out.print("Digite a segunda temperatura em Celsius que será convertida: ");
        celsius = entradaDeDados.nextDouble();
        fahrenheit = (celsius * fator1) + fator2;
        System.out.println("A conversão de " + celsius + " graus Celsius em Fahrenheit é: " + fahrenheit);
    }
}

