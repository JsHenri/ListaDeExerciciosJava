import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Insira o primeira nota:");

        n1 = scanner.nextDouble();

        System.out.println("Insira uma segunda nota:");

        n2 = scanner.nextDouble();

        media = (n1 + n2) / 2;

        if (media >= 8.5) {
            System.out.println("A");
        }

        if (media >= 7 && media < 8.5) {
            System.out.println("B");
        }

        if (media >= 5 && media < 7) {
            System.out.println("C");
        }

        if (media < 5) {
            System.out.println("D");
        }
    }
}


