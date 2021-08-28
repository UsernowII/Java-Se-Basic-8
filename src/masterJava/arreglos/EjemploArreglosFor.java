import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[5];

        int cont =  productos.length;

        for (int i =0; i<cont; i++ ){
            System.out.println("para indice "+ productos[i]);
        }
        productos[0] = "Memoria";
        productos[1] = "Samundo galaxy";
        productos[2] = "Discu duro";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook";

        Arrays.sort(productos);
        System.out.println("****Usando for***");
        for (int i =0; i<cont; i++){
            System.out.println("para indice "+ productos[i]);
        }

        System.out.println("****Usando foreach***");
        for (String prod:productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("****Usando While***");
        int i = 0;
        while (i < cont){
            System.out.println("prod = " + productos[i]);
            i++;
        }

        System.out.println("****Usando DoWhile***");
        int j = 0;
        do {
            System.out.println("prod = " + productos[j]);
            j++;
        }while (j < cont);
        
        int [] numeros = new int [10];
        int contNum = numeros.length;

        for (int k = 0; k < contNum; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0; k < contNum; k++) {
            System.out.println("numeros[k] = " + numeros[k]);
        }
    }
}
