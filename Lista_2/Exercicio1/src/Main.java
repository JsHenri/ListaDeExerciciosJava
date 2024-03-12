import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nr,raiz;
        System.out.println("Insira um numero para que exiba a sua raiz:");

        nr = scanner.nextInt();

        raiz = (nr*nr);

        if(nr >=1){
            System.out.println("A sua raiz é: "+ raiz);
        }else {
           System.out.println("Valor Invalido!");
        }
    }
}
