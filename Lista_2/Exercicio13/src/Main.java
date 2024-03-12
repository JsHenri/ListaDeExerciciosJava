import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor1;
        double valor2;
        double valor3;
        double resultado;
        double resultado2;
        int escolha;

        System.out.println("Menu:"+ "\n1.Circulo"+"\n2.Triangulo Retângulo"+"\n3.Retângulo");

        System.out.println("Faça a escolha da forma geométrica:");
        escolha = in.nextInt();


        switch (escolha) {
            case 1:
                System.out.println("Insira o raio da circunferência:");
                valor1 = in.nextDouble();

                resultado = 3.14 * (valor1*valor1);
                System.out.println("A área da circunferência é: " + resultado);

                resultado2 = (2*3.14)*valor1;
                System.out.println("o resultado do perimetro da circunferência é: "+ resultado2);
                break;
            case 2:
                System.out.println("Insira a base do triângulo retângulo:");
                valor1 = in.nextDouble();

                System.out.println("Insira a altura:");
                valor2 = in.nextDouble();

                System.out.println("Insira mais um lado para calcular o seu perímetro:");
                valor3 = in.nextDouble();

                resultado = (valor1*valor2)/2;
                System.out.println("O valor da área do triângulo retângulo é: " + resultado);

                resultado2 = valor1 + valor2 + valor3;
                System.out.println("O valor do perímetro é: " + resultado2);
                break;
            case 3:
                System.out.println("Insira a base do retângulo:");
                valor1 = in.nextDouble();

                System.out.println("Insira a altura:");
                valor2 = in.nextDouble();

                resultado = valor1 * valor2;
                System.out.println("a área do retângulo é: " + resultado);

                resultado2 = 2*(valor1 + valor2);
                System.out.println("o perímetro do retângulo é: " + resultado2);
                break;
            default:
                System.out.println("Escolha inválida!");
        }
    }
}
