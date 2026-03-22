import java.util.Scanner;

public class ExercicioCalc {
    public static void main(String[] args) {
        // DEFININDO AS VARIAVEIS
        Scanner leitor = new Scanner(System.in);
        int primeiroNumero, segundoNumero;

        // ENTRADA DOS NÚMEROS
        System.out.println("Digite o primeiro número: ");
        primeiroNumero = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = leitor.nextInt();

        // CALCULO DE CADA FUNÇÃO
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
        System.out.println(primeiroNumero + " x " + segundoNumero + " = " + (primeiroNumero * segundoNumero));

        leitor.close();
    }
}