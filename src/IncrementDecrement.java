public class IncrementDecrement {
    public static void main(String[] args) {
        // supongamos que estamos en un videojuego y queremos llevar el contador de vidas
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4
        // Forma postfija
        lives--; // Decremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives); // 4

        // Forma prefija
        // Gana un regalo por ganar una vida
        // int gift = 100 + lives++; // en postfijo se accede primero al dato de la variable sin importar si esta incrementado o no y despues la incrementa
        int gift = 100 + ++lives;
        System.out.println(gift); //
        System.out.println(lives); // 5
    }

}
