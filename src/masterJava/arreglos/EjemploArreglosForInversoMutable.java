import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void main(String[] args) {


        String[] productos = {"Memoria","Samundo galaxy","Discu duro",
                "Asus Notebook","Mackbook"};
        int cont =  productos.length;

        Arrays.sort(productos);
        System.out.println("****Usando for***");
        for (int i =0; i<cont; i++){
            System.out.println("para indice "+ productos[i]);
        }
        System.out.println("****Usando forInverso***");
        for (int i = 0; i < cont/2; i++) {
            String actual = productos[i];
            String inverso = productos[cont-1-i];
            productos[i] = inverso;
            productos[cont-1-i] = actual;
        }
        System.out.println("****Usando for***");
        for (int i =0; i<cont; i++) {
            System.out.println("para indice " + productos[i]);
        }

        Collections.reverse(Arrays.asList(productos));
        System.out.println("****Usando for Api Collections***");
        for (int i = 0; i < cont; i++) {
            System.out.println("productos = " + productos[i]);
        }
    }

}
