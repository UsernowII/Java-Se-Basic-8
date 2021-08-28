package JavaBasicPlatzi;

public class Casting {
    public static void main(String[] args) {
    // En un año ubicar 30 perritos
    // cuantos perrito ubique al mes

    double montthlyDogs = 30.0 / 12.0;
    System.out.println(montthlyDogs);

    //estimacion
    int estimatedMonthlyDogs = (int)montthlyDogs;
    System.out.println(estimatedMonthlyDogs);

    // exactitud
    int a = 30;
    int b = 12;
    System.out.println((double)a/b);

    double c = a/b;
    System.out.println(c);

    char n = '1';
    int n1 = n;
    System.out.println(n1);
    short nS = (short) n;
    System.out.println(nS);

    }
}
