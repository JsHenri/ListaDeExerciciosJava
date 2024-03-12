import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1;
        double n2;
        double result;

        System.out.println("Adcione nota 1:");
        n1 = in.nextDouble();

        System.out.println("Adcione nota 2:");
        n2 = in.nextDouble();

        result = (n1*1 + n2*2)/3;

        System.out.println("A media entre as notas é:" + result);
    }
}