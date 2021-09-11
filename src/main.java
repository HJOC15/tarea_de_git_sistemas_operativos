import java.util.Scanner;

public class main {

    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.println("Imprimir tablas que elijas");
        System.out.print("Ingresa opcion: ");
        int op = key.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.println(i + " x 9 =" + i*op);
        }

    }

}
