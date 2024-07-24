import java.util.Arrays;
import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingresa 6 números");
        for (int i = 0; i < 6; i++) {
            numeros[i] = teclado.nextInt();
        }

        int[] invertidos = new int[6];
        for (int i = 0; i < 6; i++) {
            invertidos[i] = numeros[6 - 1 - i];
        }

        System.out.println("Array invertido: " + Arrays.toString(invertidos));
    }
}
