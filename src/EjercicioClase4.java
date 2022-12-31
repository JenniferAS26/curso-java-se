import java.util.Scanner;

public class EjercicioClase4 {
    public static void main(String[] args) {
        String name = "";
        String document = "";
        int vSueldoM = 908526;
        int workDays = 0;
        int vSueldoDay = 0;
        int sueldoTotal;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Nombre empleado: ");
        name = sc.nextLine();

        System.out.println("Número de documento: ");
        document = sc.nextLine();

        System.out.println("Días trabajo mes de Junio");
        workDays = sc.nextInt();

        vSueldoDay = vSueldoM/30;
        System.out.println("Valor que se paga por día: " + vSueldoDay);

        sueldoTotal = workDays * vSueldoDay;
        System.out.println("Valor total de días trabajados: " + sueldoTotal);







    }
}
