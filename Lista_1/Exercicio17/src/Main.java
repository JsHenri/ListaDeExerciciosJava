import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v1;
        double a1;
        double t1;
        double result;

        System.out.println("Insira o velocidade inicial:");
        v1 = in.nextDouble();

        System.out.println("Insira a aceleração:");
        a1 = in.nextDouble();

        System.out.println("Insira a tempo:");
        t1 = in.nextDouble();

        result = v1+(a1*t1) ;

        System.out.println("A velocidade desse corpo é: " + result);

    }
}
