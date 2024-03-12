import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n1,n2;

        System.out.println("Insira dois numeros inteiros para que sejá exibido os numeros entre eles:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if(n1>n2){
            int aux = n1;
            n1=n2;
            n2=aux;
        }

        System.out.println("Os números existentes entre eles são:");

        for (int i = n1+1; i < n2; i++){
            System.out.println(i);
        }
    }
}
