import java.util.Scanner;

public class main {
    public static void main (String[] args){

        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("digite um número inteiro: ");
        number = in.nextInt();
        result = 2*number;
        System.out.println("O dobro do numero digitado é: " + result);
    }
}
