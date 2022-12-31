public class IfStatement {
    public static void main(String[] args) {
        // Vamos a enviar un archivo bluetooth, debemos verificar si el dispositivo esta conectado o no
        // la computadora debe verificar si esta habilitodo o no y debe recibir el resultado Verdadero o Falso
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            // Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
