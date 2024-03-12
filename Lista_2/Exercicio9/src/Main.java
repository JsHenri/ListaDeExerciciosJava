import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l1;
        double l2;
        double l3;

        System.out.println("Insira o primeiro lado do triangulo:");
        l1 = in.nextDouble();

        System.out.println("Insira o segundo lado do triangulo:");
        l2 = in.nextDouble();

        System.out.println("Insira o terceiro lado do triagulo:");
        l3 = in.nextDouble();

        if (l1 == l2 && l2 == l3) {
            System.out.println("Esse triângulo é equilátero!");
            } else if(l1 == l2 || l2 == l3 || l1 ==l3) {
            System.out.println("Esse triangulo é isóceles!");
        } else {
                System.out.println("Esse triangulo é escaleno!");
        }

    }

}
