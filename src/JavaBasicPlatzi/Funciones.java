package JavaBasicPlatzi;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de  un circulo
        //pi * r2

        System.out.println(circleArea(y));

        //Area de una esfera
        //4* pi*r2
        System.out.println(sphereArea(y));

        //volumen de una esfera
        //(4/3)*pi * r3
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOLARES "+ convertDolar(1000,"COP"));
    }

    /**
     * Descripcion: Esta funcion realiza el calucla del area de un circulo
     * @param r el valor del Radio
     * @return print con el area del circulo
     */
    public static double circleArea(double r){
        return Math.PI* Math.pow(r,2);
    }

    /**
     * Descripcion: Esta funcion realiza el calculo del area de una esfera
     * @param r el valor del Radio
     * @return print con el area de la esfera
     */
    public static double sphereArea(double r){
        return 4*Math.PI* Math.pow(r,2);
    }

    /**
     * Descripcion: Esta funcion calcula el volumen de una esfera
     * @param r el valor del Radio
     * @return print con el volumen de la esfera
     */
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripciòn: Funcion especificando su moneda convierte una cantidad de dinero en dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda : Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double convertDolar(double quantity,String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
