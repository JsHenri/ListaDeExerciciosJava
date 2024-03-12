import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resposta, acertos = 0, i = 1, escolha;


        while (i <= 10) {
            for (int numero = 0; numero <= 10; numero++) {
                System.out.println("Resolva a tabuada do " + i);
                System.out.println("Qual o resultado de: " + i + " X " + numero + "?");
                resposta = scanner.nextInt();

                if (resposta == i * numero) {
                    acertos++;
                } else {
                    System.out.println("Você errou... Deseja jogar novamente? \n1.Sim.\n2.Não.");
                    System.out.println("Selecione o número que corresponda a opção escolhida:");
                    escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            i = 1;
                            numero = -1;
                            break;

                        case 2:
                            System.out.println("Obrigado por jogar!");
                            System.out.println("Seus acertos: " + acertos);
                            return;
                    }
                }
            }

            i++;
            if (i > 10) {
                System.out.println("Parabéns você acertou todas as questões da tabuada!" +
                        "\n deseja jogar novamente? " +
                        "\n1.Sim.\n2.Não.");
                System.out.println("Selecione o número que corresponda a opção escolhida:");
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        i = 1;
                        break;

                    case 2:
                        System.out.println("Obrigado por jogar!");
                        System.out.println("Seus acertos: " + acertos);
                        return;
                }
            }


        }
    }
}