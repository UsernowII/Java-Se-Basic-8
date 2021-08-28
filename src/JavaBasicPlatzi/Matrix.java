<<<<<<< HEAD
package JavaBasicPlatzi;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        //programa que cree una matriz con la nota de 4 estudiantes,
        //cada estudiante tiene 3 notas,
        //el programa debe imprimir el nombre de cada estudiante junto con sus notas y promedio
        String students [] = new String[4];
        float grades [][] = new float[3][4];
        float suma= 0;
        Scanner sc = new Scanner(System.in);
        Scanner scaner = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe el nombre del estudiante: ");
            students[i]= sc.nextLine();
            for (int k = 0; k < 3; k++) {
                System.out.println("Digite la Nota "+ (k+1)+" del estudiante ");
                grades[i][k] = scaner.nextFloat();
                }
            }
        //Recorrer matrix para sacar promedio de las notas
        for ( int b = 0; b <4 ;b++) {
            for (int c = 0; c < 3; c++) {
                suma = suma + grades[b][c];
                grades[b][3]  = suma /3;
                suma = 0;
            }
        }
        // Escribir los datos
        System.out.println("Listado de estudiantes y sus notas");
        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(grades[i][j]);


            }

        }


        }

}
=======
package JavaBasicPlatzi;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        //programa que cree una matriz con la nota de 4 estudiantes,
        //cada estudiante tiene 3 notas,
        //el programa debe imprimir el nombre de cada estudiante junto con sus notas y promedio
        String students [] = new String[4];
        float grades [][] = new float[3][4];
        float suma= 0;
        Scanner sc = new Scanner(System.in);
        Scanner scaner = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe el nombre del estudiante: ");
            students[i]= sc.nextLine();
            for (int k = 0; k < 3; k++) {
                System.out.println("Digite la Nota "+ (k+1)+" del estudiante ");
                grades[i][k] = scaner.nextFloat();
                }
            }
        //Recorrer matrix para sacar promedio de las notas
        for ( int b = 0; b <4 ;b++) {
            for (int c = 0; c < 3; c++) {
                suma = suma + grades[b][c];
                grades[b][3]  = suma /3;
                suma = 0;
            }
        }
        // Escribir los datos
        System.out.println("Listado de estudiantes y sus notas");
        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(grades[i][j]);


            }

        }


        }

}
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55
