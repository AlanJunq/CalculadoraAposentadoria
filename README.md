# Calculadora de Aposentadoria

Este programa verifica se uma pessoa pode se aposentar com base na sua idade, sexo e anos de contribuição, de acordo com as regras gerais de aposentadoria.

## Como Usar

1. O programa solicita as seguintes informações:
   - Idade.
   - Sexo (M para Masculino, F para Feminino).
   - Anos de contribuição.

2. Ele verifica se a pessoa pode se aposentar:
   - Para homens: idade mínima de 65 anos ou 35 anos de contribuição.
   - Para mulheres: idade mínima de 60 anos ou 30 anos de contribuição.

3. Se a pessoa não pode se aposentar, o programa informa quantos anos faltam para atingir a aposentadoria.

## Como Executar

### Passos

1. **Crie um arquivo Java** com o código abaixo:

   ```java
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


2. **Compile o código:**

javac CalculadoraAposentadoria.java

3. **Execute o programa:**

java CalculadoraAposentadoria

