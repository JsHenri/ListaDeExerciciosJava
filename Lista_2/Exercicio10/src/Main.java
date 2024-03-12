import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Insira o primeiro número inteiro:");
        n1 = in.nextInt();

        System.out.println("Insira o segundo número inteiro:");
        n2 = in.nextInt();

        System.out.println("Insira o terceiro número inteiro:");
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("A ordem dos números são: " +" "+ n1+" " + n2 + " " + n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("A ordem dos números são: "+" "+ n2 + " "+n1 +" "+ n3);
        } else {
            System.out.println("A ordem dos números são: " + " " +n3+" " + n1+" " + n2);
        }
    }
}
