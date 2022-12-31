public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
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
        // esta linea nos ahora escribir todas estas de abajo
       /*if  (isTurnOnLight ){
           isTurnOnLight = false;
       } else {
           isTurnOnLight = true;
       }
       return isTurnOnLight;*/
    }
}
