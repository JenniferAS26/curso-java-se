public class ForLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <=10 ; i++) {
            printSOS();
//            System.out.println(i);
        }

    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight(){
        // Operador terneario
        // isTurnOnLight = ()?valorX:valorY; si la condicion se cumple se devuelve valorX si no se cumple se devuelve valorY
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;

    }
}
