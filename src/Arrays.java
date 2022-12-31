public class Arrays {
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
//        androidVersions[4] = "Eclair";
//        androidVersions[4] = "Froyo";
//        androidVersions[6] = "Gingerbread";
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

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

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);



    }
}
