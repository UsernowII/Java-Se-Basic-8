<<<<<<< HEAD:src/JavaBasicPlatzi/LogicOperations.java
package JavaBasicPlatzi;

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores asignacion
        System.out.println("a es igual a b ? "+ (a==b));
        System.out.println("a es diferente a b ? "+ (a!=b));

        //Operadores relacionales
        System.out.println("a es igual a b"+ (a > b ));
        System.out.println("a es menor a b"+ (a < b ));
        System.out.println("a es mayor igual a b"+ (a >= b ));
        System.out.println("a es menor igual a b"+ (a <= b ));

        if (a==b){
            System.out.println("a es igual a b");
        }else if ((a!=b) && (a<b)){
            System.out.println("a es diferente a b");
        }else if (a>b){
            System.out.println("a es mayor a b");
        }else if (a<b){
            System.out.println("a es menor a b");
        }else if (a>=b){
            System.out.println("a es mayor o igual a b");
        }else if (a>=b){
            System.out.println("a es menor o igual a b");
        }
    }
}
=======
package JavaBasicPlatzi;

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores asignacion
        System.out.println("a es igual a b ? "+ (a==b));
        System.out.println("a es diferente a b ? "+ (a!=b));

        //Operadores relacionales
        System.out.println("a es igual a b"+ (a > b ));
        System.out.println("a es menor a b"+ (a < b ));
        System.out.println("a es mayor igual a b"+ (a >= b ));
        System.out.println("a es menor igual a b"+ (a <= b ));

        if (a==b){
            System.out.println("a es igual a b");
        }else if ((a!=b) && (a<b)){
            System.out.println("a es diferente a b");
        }else if (a>b){
            System.out.println("a es mayor a b");
        }else if (a<b){
            System.out.println("a es menor a b");
        }else if (a>=b){
            System.out.println("a es mayor o igual a b");
        }else if (a>=b){
            System.out.println("a es menor o igual a b");
        }
    }
}
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55:src/LogicOperations.java
