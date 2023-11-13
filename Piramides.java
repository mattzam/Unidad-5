package piramides;

import java.util.Scanner;

public class Piramides {

    public static void main(String[] args) {
        int opcion;
        Scanner e = new Scanner(System.in);
        System.out.println("Seleccione una opción (1 o 2):");
        opcion = e.nextInt();
         
          
        switch (opcion) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                char letra = 'a';
                int numero = 1;
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            System.out.print(letra++);
                        } else {
                            System.out.print(numero++);
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
                e.close();
    }
}
