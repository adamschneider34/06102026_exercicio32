import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soma = 0;
        int menor = 0;
        int maior = 0;

        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            soma += numero;
            if (i == 0) {
                menor = numero;
                maior = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.println("Soma dos Números: " + soma);
        System.out.println("Média dos Números: " + (soma / n));
        System.out.println("Menor Número: " + menor);
        System.out.println("Maior Número: " + maior);

    }
}