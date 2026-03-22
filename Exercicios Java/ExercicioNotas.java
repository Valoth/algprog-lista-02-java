import java.util.Scanner;

public class ExercicioNotas {
    public static void main(String[] args) {
        // DEFININDO AS VARIAVEIS
        Scanner notas = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        // LEITURA DAS NOTAS
       System.out.println("Digite a primeira nota:");
       nota1 = notas.nextDouble();

       System.out.println("Digite a segunda nota:");
       nota2 = notas.nextDouble();

       System.out.println("Digite a teceira nota:");
       nota3 = notas.nextDouble();

       System.out.println("Digite a quarta nota:");
       nota4 = notas.nextDouble();


        // CALCULO DAS MEDIAS
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       System.out.println("A média das notas é: " + media);

       notas.close();
    }
}
