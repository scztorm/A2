import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0;
        System.out.println("Ingresa 10 números");

        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i]%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
