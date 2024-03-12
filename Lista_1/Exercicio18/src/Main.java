import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double result;

        System.out.println("Insira o valor de a:");
        a = in.nextDouble();

        System.out.println("Insira o valor de b:");
        b = in.nextDouble();

        result = (0-b)/a;

        System.out.println("O resultado da equação é: " + result);

    }
}