import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Memoria";
        productos[1] = "Samundo galaxy";
        productos[2] = "Discu duro";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook";

        Arrays.sort(productos);

        String prod1 =productos[0];
        String pro2 = productos[1];
        String pro3 = productos[2];
        String pro4 = productos[3];
        String pro5 = productos[4];

        System.out.println("prod1 = " + prod1);
        System.out.println("pro2 = " + pro2);
        System.out.println("pro3 = " + pro3);
        System.out.println("pro4 = " + pro4);
        System.out.println("pro5 = " + pro5);

        int [] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -1;


        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length-1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }
}
