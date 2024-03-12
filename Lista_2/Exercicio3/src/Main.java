import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n1,n2, media;

        System.out.println("Insira o primeira nota:");

        n1 = scanner.nextInt();

        System.out.println("Insira um segunda nota:");

        n2 = scanner.nextInt();

        media = (n1+n2)/2;

        if(media >=50){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
