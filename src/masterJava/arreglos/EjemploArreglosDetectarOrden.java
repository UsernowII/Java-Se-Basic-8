import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int [7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length -1; i++) {
            if(a[i] > a[i+1]){
                descendente = true;
            }
            if(a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true){
            System.out.println("Arreglo = desordenado");
        }

        if(ascendente == false && descendente == false){
            System.out.println("Arreglo = todos osn iguales");
        }

        if(ascendente ==true && descendente == false){
            System.out.println("arreglo = ordenado de forma ascendente");
        }

        if(ascendente == false && descendente == true){
            System.out.println("Arreglo = ordenado fe forma descendente");
        }
    }
}
