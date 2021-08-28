import java.util.Scanner;

public class EjemploArregloNotasAlumnos {

    public static void main(String[] args) {

        double [] claseMatematicas, claseHistoria, claseLenguaje;
        
        double sumaNotasMatematicas = 0 , sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i <claseMatematicas.length; i++) {
            claseMatematicas[i] = sc.nextDouble();
        }


        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = sc.nextDouble();
        }


        for (int i = 0; i < 7; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumaNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;
        System.out.println("prmedio de la clase matematicas: " + promedioMatematicas );
        System.out.println("prmedio de la clase historia: " + promedioHistoria);
        System.out.println("prmedio de la clase lenguaje: " + promedioLenguaje);

        System.out.println("promedio total del curso: " + (promedioHistoria+promedioLenguaje+promedioMatematicas)/3 );

        System.out.println("Ingrese el identificador del alumno (de 0-6): ");
        int id = sc.nextInt();
        double promedioAlmundo = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/ 3;
        System.out.println("promedioAlmundo Nro ID= " + id + promedioAlmundo);
    }
}
