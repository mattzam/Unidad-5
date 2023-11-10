/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosu4;
/**
 *
 * @author expec
 */
public class MetodosU4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int resultadoSuma = MetodosU4.suma(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = MetodosU4.resta(5, 3);
        System.out.println("Resta: " + resultadoResta);

        int resultadoProducto = MetodosU4.producto(5, 3);
        System.out.println("Producto: " + resultadoProducto);

        int resultadoDivision = MetodosU4.division(6, 2);
        System.out.println("División: " + resultadoDivision);
    }
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int producto(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
            return a / b;
        }
}
