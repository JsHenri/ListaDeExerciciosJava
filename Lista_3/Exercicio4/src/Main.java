public class Main {
    public static void main(String[] args){

        System.out.println("A conversão dessas temperaturas em Celsius para Fahrenheit é: ");
        for(int i=-80; i<=80; i+=10){
            int fahrenheit = i*9/5+32;
            System.out.println(i+"°C"+ "="+ fahrenheit + "°F");
        }
    }
}
