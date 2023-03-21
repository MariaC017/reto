import java.util.Scanner;

public class reto10 {
    /// 16 productos
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String productos[][] = new String[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.println("Digita el producto co su respectivo precio en la posicion" + i + j);
                productos[i][j] = lector.nextLine();

            }
        }
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(productos[i][j] + "\t");

            }
            System.out.println();
        }
        lector.close();

    }
}
