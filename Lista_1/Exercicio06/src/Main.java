import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m;
        double result;
        System.out.println("Insira a velocidade em m/s");
        m = in.nextDouble();
        result = m * 3.6;

        System.out.println("A conversão em Km/h é: " + result);

    }
}
