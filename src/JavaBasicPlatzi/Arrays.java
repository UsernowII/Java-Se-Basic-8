<<<<<<< HEAD
<<<<<<< HEAD:src/JavaBasicPlatzi/Arrays.java
package JavaBasicPlatzi;

public class Arrays {
    public static void main (String[] args){
        String[] androidVersions = new String[17];
        String days [] = new String [7];

        String cities [][] = new String [4][2];

        /*
        *--------------------------
        * | Country  | City       |
        * _________________________
        * |Mexico    | CDMX       |
        * |Mexico    | Guadalajara|
        * |Colombia  | Bogota     |
        * |Colombia  | Medellin   |
        * _________________________
         */

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [3][3][3][3];
        // JavaBasicPlatzi.Arrays una dimension
        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for ( int i = 0; i < androidVersions.length; i++){
            System.out.println(androidVersions[i]);
        }
        for (String item :androidVersions) {
            System.out.println(item);
        }

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/



        System.out.println("________________");
        // arrays dos dimensiones

        cities [0][0] = "Colombia";
        cities [0][1] = "Medellin";
        cities [1][0] = "Colombia";
        cities [1][1] = "Bogota";
        cities [2][0] = "Mexico";
        cities [2][1] = "Guadalajara";
        cities [3][0] = "Mexico";
        cities [3][1] = "CDMX";

        /*System.out.println(cities [0][0]);
        System.out.println(cities [0][1]);
        System.out.println(cities [1][0]);
        System.out.println(cities [1][1]);
        System.out.println(cities [2][0]);
        System.out.println(cities [2][1]);
        System.out.println(cities [3][0]);
        System.out.println(cities [3][1]);*/

        /*for (int i = 0; i <cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities [i][j]);
            }
        }*/
        for (String [] pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
        System.out.println("________________");

        // JavaBasicPlatzi.Arrays 4 dimensiones

        String animals[][][][] = new String[2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        
    }
}
=======
package JavaBasicGeekipedia;
=======
package JavaBasicPlatzi;
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55

public class Arrays {
    public static void main (String[] args){
        String[] androidVersions = new String[17];
        String days [] = new String [7];

        String cities [][] = new String [4][2];

        /*
        *--------------------------
        * | Country  | City       |
        * _________________________
        * |Mexico    | CDMX       |
        * |Mexico    | Guadalajara|
        * |Colombia  | Bogota     |
        * |Colombia  | Medellin   |
        * _________________________
         */

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [3][3][3][3];
<<<<<<< HEAD
        // JavaBasicGeekipedia.Arrays una dimension
=======
        // JavaBasicPlatzi.JavaBasicGeekipedia.Arrays una dimension
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55
        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for ( int i = 0; i < androidVersions.length; i++){
            System.out.println(androidVersions[i]);
        }
        for (String item :androidVersions) {
            System.out.println(item);
        }

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/



        System.out.println("________________");
        // arrays dos dimensiones

        cities [0][0] = "Colombia";
        cities [0][1] = "Medellin";
        cities [1][0] = "Colombia";
        cities [1][1] = "Bogota";
        cities [2][0] = "Mexico";
        cities [2][1] = "Guadalajara";
        cities [3][0] = "Mexico";
        cities [3][1] = "CDMX";

        /*System.out.println(cities [0][0]);
        System.out.println(cities [0][1]);
        System.out.println(cities [1][0]);
        System.out.println(cities [1][1]);
        System.out.println(cities [2][0]);
        System.out.println(cities [2][1]);
        System.out.println(cities [3][0]);
        System.out.println(cities [3][1]);*/

        /*for (int i = 0; i <cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities [i][j]);
            }
        }*/
        for (String [] pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
        System.out.println("________________");

<<<<<<< HEAD
        // JavaBasicGeekipedia.Arrays 4 dimensiones
=======
        // JavaBasicPlatzi.JavaBasicGeekipedia.Arrays 4 dimensiones
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55

        String animals[][][][] = new String[2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        
    }
}
<<<<<<< HEAD
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55:src/JavaBasicGeekipedia/Arrays.java
=======
>>>>>>> 0995f1d4d6cc795f38b4dfcd387d1eeaba76de55
