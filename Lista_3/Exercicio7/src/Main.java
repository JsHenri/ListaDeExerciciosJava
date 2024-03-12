public class Main {
    public static void main (String[] args){

        System.out.println("Tabuada do 1 ao 10.");
        for (int i = 1; i <=10; i++){
            System.out.println("Tabuada do " + i + ":" + "\n ");
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " X " + j + " = " + i*j);

            System.out.println("\n ");
        }

    }
}
