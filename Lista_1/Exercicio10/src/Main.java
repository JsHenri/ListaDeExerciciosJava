import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m;
        double result;

        System.out.println("Coloque a velocidade em milhas:");
        m = in.nextDouble();
        result = m *1.609;

        System.out.println("O resultado em km/h é: " + result);
    }
}
