import java.util.Queue;
import java.util.concurrent.ConcurrentNavigableMap;

public class Funciones {
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double convertToDolar(double quantity, String currency){
        // MXN COP
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

    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // pi*r2
        double area = circleArea(y);
        System.out.println(area);

        // Area de una esfera
        // 4pi*r2
        double sphArea = sphereArea(y);
        System.out.println(sphArea);

        // Volumen de una esfera
        //(4/3)pi*r3
        double sphVol = sphereVolumen(y);
        System.out.println(sphVol);

        System.out.println("PESOS A DOLARES: " + convertToDolar(1000, "COP"));


    }
}
