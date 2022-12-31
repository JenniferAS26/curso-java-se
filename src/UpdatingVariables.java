public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Bono $200
        salary = salary + 200;
        System.out.println(salary);

        // pesion: $50 decuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extras $30 c/u
        // Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        // Actualizando cadenas de texto, usamos el caracter + para concatenar cadenas de texto
        String employeeName = "Jennifer Alarcón";
        employeeName = employeeName + " Serna";
        System.out.println(employeeName);
        employeeName = "No tengo primer nombre " + employeeName;
        System.out.println(employeeName);

    }
}
