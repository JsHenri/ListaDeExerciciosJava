import java.util.Scanner;

public class Main {
   public static void main(String[] args){

      int numero, i;

       Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o numero a ser multiplicado: ");
      numero = scanner.nextInt();

      i= 0;

      System.out.println("A tabuada desse número é:");
      while (i <= 10){
         int resultado = numero * i;
         System.out.println(numero + "X" + i + "=" + resultado);
         i++;

      }

   }
}
