import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delta;
        double result1;
        double result2;

        System.out.println("Insira o valor de a:");
        a = in.nextDouble();

        System.out.println("Insira o valor de b:");
        b = in.nextDouble();

        System.out.println("Insira o valor de c:");
        c = in.nextDouble();

        delta = ((b*b)-(4*a*c));
        result1 = (((-b) + sqrt(delta))/(2*a));
        result2 = (((-b) - sqrt(delta))/(2*a));

        if(delta >=0) {
            System.out.println("O resultado positivo da equação é: " + result1);
            System.out.println("O resultado negativo da equação é: " + result2);
        } else {
            System.out.println("A raiz não possui números reais");
        }

    }
}

