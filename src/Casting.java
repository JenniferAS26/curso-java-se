public class Casting {
    public static void main(String[] args) {

        // En un año ubiqué en hogares a 30 perritos
        // Cuantos perritos ubiqué al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs; // quita todos los decimales
        System.out.println(estimatedMonthlyDogs);

        // EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b); // El dato es lo mas preciso posible

        double c = (double) a/b; // precision
        //double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI); // codigo ascii ?

        short nS = (short) n;
        System.out.println(nS);


    }
}
