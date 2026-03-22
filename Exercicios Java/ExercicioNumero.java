import java.util.Scanner;

public class ExercicioNumero {
    public static void main(String[] args) {
        // DEFININDO AS VARIAVEIS
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        boolean condition = true;

        // COLETA DO NUMERO
        while (condition) {
            System.out.println("Digite o seu número: ");

            // PRECAUCAO PARA INSERCAO DE VALORES FORA DO PADRAO
            if (leitor.hasNextInt()) {
                numero = leitor.nextInt();
                condition = false;
            } else {
                System.out.println("Valor inválido! Você não digitou um número.");
                leitor.next();
            }
        }
        // SAIDA DO NUMERO
        System.out.println("O número informado foi " + numero + ".");
        leitor.close();
    }
}