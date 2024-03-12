import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double k;
        double result;

        System.out.println("Coloque a velocidade em Km/h:");
        k = in.nextDouble();
        result = k /1.609;

        System.out.println("O resultado em milhas é: " + result);
    }
}

