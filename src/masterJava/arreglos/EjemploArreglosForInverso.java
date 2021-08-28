import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

        //String[] productos = new String[5];

        String[] productos = {"Memoria","Samundo galaxy","Discu duro",
                "Asus Notebook","Mackbook"};
        int cont =  productos.length;

        /*
        productos[0] = "Memoria";
        productos[1] = "Samundo galaxy";
        productos[2] = "Discu duro";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook";
        */


        Arrays.sort(productos);
        System.out.println("****Usando for***");
        for (int i =0; i<cont; i++){
            System.out.println("para indice "+ productos[i]);
        }
        System.out.println("****Usando forInverso***");
        for (int i = 0; i < cont; i++) {
            System.out.println("para indice "+i+" "+ productos[cont-1-i]);
        }

        System.out.println("****Usando for inverso 2****");
        for (int i = cont-1; i >=0 ; i--) {
            System.out.println("productos[i] = " + productos[i]);
        }
    }
}
