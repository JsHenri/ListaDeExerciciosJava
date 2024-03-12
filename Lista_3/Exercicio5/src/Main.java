import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Insira um número para que o seja exibido o seu fatorial: ");
        numero = scanner.nextInt();
        int fatorial = 1;

        for (int i=1 ;i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
