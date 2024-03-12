import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, i=0 , a = 0, b = 1,aux;

        System.out.println("Insira um número para definir a quantidade da sequência:");
        numero = scanner.nextInt();

        System.out.println("Esta é a sequência de Fibonacci com "+numero+" números:\n");
        while (i < numero){
            System.out.println(b);
            aux = a;
            a = b;
            b = aux+b;
            i++;
        }

    }

}
