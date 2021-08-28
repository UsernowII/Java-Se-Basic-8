<<<<<<< HEAD:src/JavaBasicPlatzi/DoWhile.java
package JavaBasicPlatzi;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        int response = 0;

        do{
            System.out.println("Selecciona el numero de la opcion deseada: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner teclado = new Scanner(System.in);
            response = Integer.valueOf(teclado.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }

        }while (response != 0);
    }
}

=======
package JavaBasicPlatzi;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        int response = 0;

        do{
            System.out.println("Selecciona el numero de la opcion deseada: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner teclado = new Scanner(System.in);
            response = Integer.valueOf(teclado.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }

        }while (response != 0);
    }
}

>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55:src/DoWhile.java
