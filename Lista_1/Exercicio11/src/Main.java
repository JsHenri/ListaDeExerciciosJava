import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c;
        double result;

        System.out.println("Coloque a temperatura em celcius:");
        c = in.nextDouble();
        result = c*1.8+32;

        System.out.println("A temperatura em Fahrenheit é:" + result);

    }
}
