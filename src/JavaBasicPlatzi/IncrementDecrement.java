package JavaBasicPlatzi;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives); //4

        lives --; //Decremento
        System.out.println(lives); //3

        lives ++; //incremento //4
        System.out.println(lives);

        //Prefija
        // gana un regalo por ganar una vida
        int gift = 100 + lives++;//posfijo
        System.out.println(lives);
        gift = 100 + ++lives;//prefijo
        System.out.println(gift );




    }
}
