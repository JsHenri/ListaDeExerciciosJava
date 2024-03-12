import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double mm;
        double result;

        System.out.println("Coloque a medida em mm:");
        mm = in.nextDouble();
        result = mm/25.4;

        System.out.println("O resultado em polegada é: " + result);
    }
}
