<<<<<<< HEAD
package JavaBasicPlatzi;

import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args) {
        //Programa que cree, cargue y escriba un vector de 5 numeros enteros

        int entero[] = new int[5];
        int i = 0;
        int suma = 0;
        int mayor, menor, pos;
        Scanner sc = new Scanner(System.in);
        //almacenando contenido en el vector
        for (int j = 0; j < 5; j++) {
            System.out.print("Digite valor " + (j + 1) + " : ");
            entero[j] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("contenido del vector");
        //imprimiento el contenido del vector
        for (int k = 0; k < 5; k++) {
            System.out.print(entero[k] + ", ");
        }
        System.out.println();
        // operando el vector para sumar su contenido
        for (int j = 0; j < 5; j++) {
            suma = suma + entero[j];

        }
        System.out.println("suma" + suma);

        mayor = entero[0];
        pos = 0;

        for (int j = 0; j <5 ; j++) {
            if (mayor < entero[j]){
                mayor = entero[j];
                pos = j;
            }else{
                mayor = entero[j];
            }
        }
        System.out.println(mayor);
    }
}
=======
package JavaBasicPlatzi;

import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args) {
        //Programa que cree, cargue y escriba un vector de 5 numeros enteros

        int entero[] = new int[5];
        int i = 0;
        int suma = 0;
        int mayor, menor, pos;
        Scanner sc = new Scanner(System.in);
        //almacenando contenido en el vector
        for (int j = 0; j < 5; j++) {
            System.out.print("Digite valor " + (j + 1) + " : ");
            entero[j] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("contenido del vector");
        //imprimiento el contenido del vector
        for (int k = 0; k < 5; k++) {
            System.out.print(entero[k] + ", ");
        }
        System.out.println();
        // operando el vector para sumar su contenido
        for (int j = 0; j < 5; j++) {
            suma = suma + entero[j];

        }
        System.out.println("suma" + suma);

        mayor = entero[0];
        pos = 0;

        for (int j = 0; j <5 ; j++) {
            if (mayor < entero[j]){
                mayor = entero[j];
                pos = j;
            }else{
                mayor = entero[j];
            }
        }
        System.out.println(mayor);
    }
}
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55
