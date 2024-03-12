import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double k;
        double result;
        System.out.println("Insira a velocidade em Km/h");
        k = in.nextDouble();
        result = k / 3.6;

        System.out.println("A conversão em m/s é: " + result);

    }
}
