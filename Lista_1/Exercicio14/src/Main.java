import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b1;
        double a1;
        double result;

        System.out.println("Insira a base:");
        b1 = in.nextDouble();

        System.out.println("Insira a altura:");
        a1 = in.nextDouble();

        result = (b1*a1)/2;

        System.out.println("A area desse triangulo retangulo é: " + result);

    }
}
