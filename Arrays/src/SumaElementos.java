import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingresa 5 números");
        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }
}
