import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n1,n2,n3,media,media2;

        System.out.println("Insira o primeira nota:");

        n1 = scanner.nextDouble();

        System.out.println("Insira uma segunda nota:");

        n2 = scanner.nextDouble();

        media = (n1+n2)/2;

        if(media >=50){
            System.out.println("Aprovado");
        }else {
            System.out.println("Insira o resultado da prova de recuperação:");
            n3= scanner.nextDouble();

            media2 = (media+n3)/2;

            if(media2 >=50){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
        }
    }
}
