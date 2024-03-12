import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;
        double resultado;
        int escolha;


        System.out.println("Insira o dinheiro: ");
        valor = in.nextDouble();

        System.out.println("Menu:"+ "\n1.Café Expresso R$ 0,50"+"\n2.Café Longo R$ 1,00"+"\n3.Capuccino R$ 2,50"+"\n4.Chocolate R$ 2,00");

        System.out.println("Faça a escolha de uma das opções:");
        escolha = in.nextInt();


        switch (escolha) {
            case 1:
                resultado = valor - 0.50;
                System.out.println("A bebida selecionada é: Café Expresso");
                System.out.println("Troco do pedido: " + resultado);

                break;
            case 2:
                resultado = valor - 1;
                System.out.println("A bebida selecionada é: Café Longo");
                System.out.println("Troco do pedido: " + resultado);

                break;
            case 3:
                resultado = valor - 2.50;
                System.out.println("A bebida selecionada é: Capuccino");
                System.out.println("Troco do pedido: " + resultado);

                break;
            case 4:
                resultado = valor - 2;
                System.out.println("A bebida selecionada é: Chocolate");
                System.out.println("Troco do pedido: " + resultado);

                break;
            default:
                System.out.println("Escolha inválida!");
        }
    }
}