import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1;

        System.out.println("Insira uma numeração válida:");

        n1 = scanner.nextDouble();

        if (n1 >= 5 && n1 <=9) {
            System.out.println("Opção válida!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}

