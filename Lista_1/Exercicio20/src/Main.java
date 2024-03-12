import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double a;
        double b;
        double c;
        double raiz1;
        double raiz2;

        System.out.println("Insira a primeira raiz:");
        raiz1 = in.nextDouble();

        System.out.println("Insira a segunda raiz:");
        raiz2 = in.nextDouble();

        a = 1;
        b = -(raiz2+raiz1);
        c = (raiz1*raiz2);

        System.out.println("O resultado da primeira equação é: " + a);
        System.out.println("O resultado da segunda equação é: " + b);
        System.out.println("O resultado da terceira equação é: " + c);


    }
}