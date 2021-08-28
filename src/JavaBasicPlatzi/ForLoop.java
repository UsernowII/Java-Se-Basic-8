<<<<<<< HEAD:src/JavaBasicPlatzi/ForLoop.java
package JavaBasicPlatzi;

public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOffLight();
        for (int i = 1;i <= 10; i++ ){
            printSOS();
        }
        
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOffLight(){
        isTurnOnLight = (isTurnOnLight)? false:true;
        return isTurnOnLight;
    }
}
=======
package JavaBasicPlatzi;

public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOffLight();
        for (int i = 1;i <= 10; i++ ){
            printSOS();
        }
        
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOffLight(){
        isTurnOnLight = (isTurnOnLight)? false:true;
        return isTurnOnLight;
    }
}
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55:src/ForLoop.java
