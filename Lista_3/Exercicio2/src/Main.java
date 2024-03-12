import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número nos próximos 5 espaços" +
                " para que sejam exibidos o maior e o menor dentre eles:\n ");

        int maior = 0, menor = 0, i = 0;
        while (i < 5) {
            int numero;

            System.out.println("Insira seu número aqui:");
            numero = scanner.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor){
                    menor = numero;
                }

            }
            i++;
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}

