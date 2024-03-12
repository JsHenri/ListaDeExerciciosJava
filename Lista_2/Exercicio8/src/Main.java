import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1, result;

        System.out.println("Insira um número inteiro:");

        n1 = scanner.nextInt();

        result = n1%2;

        if (result == 0) {
            System.out.println("O número inserido é par!");
        } else {
            System.out.println("O número inserido é impar!");
        }
    }
}

