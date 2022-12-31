public class ForLoopAnidado {
    public static void main(String[] args) {
        String[] androidVersions = new String[17]; // Este arreglo a medida que pasa el tiempo no puede crecer más
        String days[] = new String[7]; // Este es un buen uso para los arreglos porque los días de la semana nunca van a cambiar

        String[][] cities = new String[4][2]; // 4*2 = 8 (dimension)
        /*  paquetes de pares de datos
            +------------------------+
            |  Country |    City     |
            --------------------------
            | México   | CDMX        |
            | México   | Guadalajara |
            | Colombia | Bogotá      |
            | Colombia | Medellín    |
            +------------------------+
         */
        // Los arreglos al ser convenciones de datos siempres son en plural
        int [][][] numbers = new int[2][2][2]; //
        int [][][][] numbers4 = new int[2][2][2][2];


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        androidVersions[4] = "Eclair";
        androidVersions[5] = "Froyo";
        androidVersions[6] = "Gingerbread";

        for (int i = 0; i <=androidVersions.length -1 ; i++) {
            System.out.println(androidVersions[i]);
        }
        System.out.println();
        System.out.println("print with foreach");
        System.out.println();
        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }



        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/
// Fori Anidados
        System.out.println("fori anidado");
        System.out.println();
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
// Foreach aniadados
        System.out.println();
        System.out.println("foreach anidados ");
        System.out.println();

        for (String[] pair :cities) {
            for (String name:pair) {
                System.out.println(name);
            }

        }

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
//        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1 ; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }

        }
    }
}
