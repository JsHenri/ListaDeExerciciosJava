import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;
        int parcelas;
        double resultado;
        int escolha;


        System.out.println("Insira o valor da compra: ");
        valor = in.nextDouble();

        System.out.println("Menu:"+ "\n1.Débito"+"\n2.Pix"+"\n3.Crédito");

        System.out.println("Faça a escolha da forma de pagamento:");
        escolha = in.nextInt();


        switch (escolha) {
            case 1:
                resultado = valor * 0.95;
                System.out.println("O valor com desconto é: " + resultado);
                break;
            case 2:
                resultado = valor * 0.90;
                System.out.println("O valor com desconto é: " + resultado);
                break;
            case 3:
                System.out.println("Insira a quantidade de parcelas:");
                parcelas = in.nextInt();

                if(parcelas <=4) {
                    resultado = valor * 1.02;
                    System.out.println("o valor com juros é: " + resultado);
                } else {
                    resultado = valor * 1.05;
                    System.out.println("o valor com juros é: " + resultado);
                }
                break;
            default:
                System.out.println("Escolha inválida!");
        }
    }
}
