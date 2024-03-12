import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r1;
        double a1;
        double result;

        System.out.println("Insira o raio:");
        r1 = in.nextDouble();

        System.out.println("Insira a altura:");
        a1 = in.nextDouble();

        result = (3.14 * (r1 * r1)*a1)/3;

        System.out.println("A area desse cone é: " + result);

    }
}
