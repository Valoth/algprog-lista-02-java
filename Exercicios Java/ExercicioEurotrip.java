import java.util.Scanner;

public class ExercicioEurotrip {
    public static void main(String[] args) {

        // DEFININDO AS VARIAVEIS
        Scanner leitor = new Scanner(System.in);
        double alemanha, portugal, italia, totalViagem;
        int pessoas;

        // LEITURA DOS VALORES DAS VIAGENS
        System.out.println("Digite o valor da viagem para Alemanha:");
        alemanha = leitor.nextDouble();

        System.out.println("Digite o valor da viagem para Portugal:");
        portugal = leitor.nextDouble();

        System.out.println("Digite o valor da viagem para Italia:");
        italia = leitor.nextDouble();

        // LEITURA DA QUANTIDADE DE PESSOAS
        System.out.println("Digite a quantidade de pessoas:");
        pessoas = leitor.nextInt();

        // CALCULO DO VALOR TOTAL
        totalViagem = alemanha + portugal + italia;

        // EXIBICAO DOS RESULTADOS NA TELA
        System.out.println("Total da viagem: R$ " + totalViagem);
        System.out.println("Total de pessoas: " + pessoas);

        leitor.close();
    }
}