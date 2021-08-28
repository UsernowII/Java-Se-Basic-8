import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja(Object [] arreglo){
        int total = arreglo.length;
        int cont = 0;
        for(int i = 0; i<total; i++){
            for(int j = 0; j< total; j++){
                if( ((Comparable<Object>)arreglo[i]).compareTo(arreglo[j]) >0 ){
                    Object auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
                cont++;
            }

        }
        System.out.println("cont = " + cont);
    }

    public static void main(String[] args) {


        String[] productos = {"Memoria","Samundo galaxy","Discu duro",
                "Asus Notebook","Mackbook"};
        int cont =  productos.length;
        int contador = 0;


        sortBurbuja(productos);
        System.out.println("****Usando for A***");
        for (int i = 0; i < cont; i++) {
            System.out.println("productos = " + productos[i]);
        }

        int [] numeros = new int[4];
        numeros [0] = 10;
        numeros [1] = Integer.valueOf("7");
        numeros [2] = 35;
        numeros [3] = -1;
    //mejorando el ordenamiento burbuja
        for(int i = 0; i< numeros.length-1; i++){
            for(int j = 0; j< numeros.length-1 -i; j++){
                if( ((Integer)numeros[j+1]).compareTo(numeros[j]) <0 ){
                    int auxiliar = numeros[j];
                    numeros[i] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);


        System.out.println("****Usando Burbuja 2.0***");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
}
