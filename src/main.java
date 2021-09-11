import java.util.Scanner;

public class main {

    public static void main(String args[]){

        Scanner key = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int primero = key.nextInt();

        System.out.println("Ingresa el segundo numero");
        int segundo = key.nextInt();

        System.out.println("La suma de " + primero + " y " + segundo + " es: " + (primero+segundo));
    }

}
