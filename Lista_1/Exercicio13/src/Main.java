import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r1;
        double result;

        System.out.println("Insira o raio:");
        r1 = in.nextDouble();

        result = 3.14 * (r1 * r1);

        System.out.println("A area desse raio é: " + result);

    }
}
