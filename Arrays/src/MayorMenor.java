import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor, menor;

        System.out.println("Ingresa 8 números");
        for (int i = 0; i < 8; i++) {
            numeros[i] = teclado.nextInt();
        }

        mayor = menor = numeros[0];
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
