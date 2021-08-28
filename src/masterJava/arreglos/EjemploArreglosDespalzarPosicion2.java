import java.util.Scanner;

public class EjemploArreglosDespalzarPosicion2 {

    public static void main(String[] args) {
        
        int [] numeros = new int[10];
        int elemento, posicion;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length -1; i++) {
            System.out.print("Ingrese el numero");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = sc.nextInt();
        System.out.println("Posicion donde agregar el elmentos < 0-9>");
        posicion = sc.nextInt();

        for (int i = numeros.length -2; i >= posicion ; i--) {
            numeros[i+1] = numeros[i];
        }
        
        numeros[posicion] = elemento;

        System.out.println("El arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
}
