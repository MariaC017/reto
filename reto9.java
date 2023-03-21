import java.util.Scanner;

public class reto9 {
    /// emojis
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int fila;
        int columna;

        System.out.println("Digita el numero de filas");
        fila = lector.nextInt();

        System.out.println("Digita el numero de columnas");
        columna = lector.nextInt();
        String caritas[][] = new String[fila][columna];

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {

                System.out.println("Digita el emoji en la posicion" + i + j);
                caritas[i][j] = lector.next();
                System.out.println("----------------------------");

            }
        }
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {

                System.out.print(caritas[i][j] + "\t");

            }
            System.out.println();
        }
        lector.close();

    }
}
