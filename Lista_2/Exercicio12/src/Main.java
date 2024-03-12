import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor1;
        double valor2;
        double resultado;
        int escolha;

        System.out.println("Insira o primeiro valor:");
        valor1 = in.nextDouble();

        System.out.println("Insira o segundo valor:");
        valor2 = in.nextDouble();

        System.out.println("Menu:"+ "\n1.Soma"+"\n2.Subtração"+"\n3.Multiplicação"+"\n4.Divisão");

        System.out.println("Faça a escolha da conta:");
        escolha = in.nextInt();

        switch (escolha) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println("O valor da conta é: " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("O valor da conta é: " + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("O valor da conta é: " + resultado);
                break;
            case 4:
                resultado = valor1 / valor2;
                System.out.println("O valor da conta é: " + resultado);
                break;
            default:
                System.out.println("Escolha inválida!");
        }
    }
}
