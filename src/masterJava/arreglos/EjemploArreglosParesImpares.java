import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        
        
        int[] a , pares, impares;
        int totalPares = 0, totaImpares = 0;
        
        a = new int [10];


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                totalPares++;
            }else {
                totaImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int [totaImpares];

        int j = 0;
        int k = 0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i] %2 == 0){
                pares[j++] = a[i];
            }else{
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }



    }
}
