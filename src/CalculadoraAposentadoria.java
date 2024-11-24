import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite seus anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        boolean podeAposentarPorIdade = (sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60);
        boolean podeAposentarPorTempo = (sexo == 'M' && anosContribuicao >= 35) || (sexo == 'F' && anosContribuicao >= 30);

        if (podeAposentarPorIdade || podeAposentarPorTempo) {
            System.out.println("Você já pode se aposentar!");
        } else {
            int anosFaltando = (sexo == 'M') ? Math.max(65 - idade, 35 - anosContribuicao) : Math.max(60 - idade, 30 - anosContribuicao);
            System.out.println("Faltam " + anosFaltando + " anos para a aposentadoria.");
        }

        scanner.close();
    }
}
