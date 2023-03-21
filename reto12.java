import java.util.Scanner;

public class reto12 {
    public static void main(String[] args) {

        int cantidadc;
        double hora[];
        String nombres[];
        String nombreganador;
        double tiempoganador;

        Scanner lector = new Scanner(System.in);
        System.out.println("digite cantidad participantes");
        cantidadc = lector.nextInt();

        hora = new double[cantidadc];
        nombres = new String[cantidadc];

        for (int i = 0; i < hora.length; i++) {
            System.out.println("digite el nombre");
            nombres[i] = lector.next();
            System.out.println("digite el tiempo");
            hora[i] = lector.nextDouble();

        }
        System.out.println("Nombre competidor tiempo");
        for (int i = 0; i < hora.length; i++) {
            System.out.println(nombres[i] + " " + hora[i]);

        }
        nombreganador = nombres[0];
        tiempoganador = hora[0];
        for (int i = 1; i < hora.length; i++) {
            if (hora[i] > tiempoganador) {
                nombreganador = nombres[i];
                tiempoganador = hora[i];
            }

        }
        System.out.println("el ganador es " + nombreganador + " con un tiempo de " + tiempoganador);
        lector.close();

    }
}
