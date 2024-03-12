import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n1,n2;

        System.out.println("Insira o primeiro número:");

        n1 = scanner.nextInt();

        System.out.println("Insira um segundo número:");

        n2 = scanner.nextInt();

        if(n1 >n2){
            System.out.println("O número maior é: " +n1);
        }else {
            System.out.println("O número maior é: " +n2);
        }
    }
}
