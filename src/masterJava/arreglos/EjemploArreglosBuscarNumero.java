import java.util.Scanner;

public class EjemploArreglosBuscarNumero {

    public static void main(String[] args) {

        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero");
            a[i] = sc.nextInt();
        }

        System.out.println("\r\nIngrese un numero a buscar");
        int num = sc.nextInt();
        int i= 0;
        while(i < a.length && a[i] != num){
            i++;
        }
        if (i == a.length){
            System.out.println("Numero no encontrado");
        }else if(a[i] == num){
            System.out.println("Econtrado en la posicion " + i);
        }
    }
}
