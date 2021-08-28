package JavaBasicPlatzi;

import java.util.Scanner;

public class VectorBidimensional {

    public static void main(String[] args) {

        //matrix
        Scanner sc = new Scanner(System.in);
        int k, j;
        String nombre [][] = new String [4][2];
        //crear el contenido de la matriz
        for ( k = 0; k < 4 ; k++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Digite nombre "+ (k+1)+ ". "+ (j+1) +". ");
                nombre [k][j] = sc.nextLine();
            }
        }

        //Esribir el contenido de la matriz
        System.out.println();
        System.out.println("Lista de nombres contenidos");
        for (k = 0; k < 4; k++) {
            for (j = 0; j < 2; j++) {
                System.out.println(nombre[k][j]+ "\t");

            }

        }
    }
}
