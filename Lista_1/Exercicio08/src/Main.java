import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double p;
        double result;

        System.out.println("Coloque a medida em polegada:");
        p = in.nextDouble();
        result = p*25.4;

        System.out.println("O resultado em milimitros é: " + result);
    }
}
