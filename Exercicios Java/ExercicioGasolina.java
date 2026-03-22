import java.util.Scanner;

public class ExercicioGasolina {
    public static void main(String[] args) {
        // DEFININDO AS VARIAVEIS
        Scanner leitor = new Scanner(System.in);

        double precoGasolina;
        double litros;

        // VALIDAÇÃO DO PREÇO
        while (true) {
            System.out.print("Digite o preço do litro da gasolina: ");

            if (leitor.hasNextDouble()) {
                precoGasolina = leitor.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido! Digite um número válido.");
                leitor.next();
            }
        }

        // VALIDAÇÃO DOS LITROS
        while (true) {
            System.out.print("Digite a quantidade de litros: ");

            if (leitor.hasNextDouble()) {
                litros = leitor.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido! Digite um número válido.");
                leitor.next();
            }
        }

        // DEFININDO O VALOR TOTAL
        double total = precoGasolina * litros;

        System.out.println("Total a pagar: R$ " + total);

        leitor.close();
    }
}