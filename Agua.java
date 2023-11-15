/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agua;

/**
 *
 * @author expec
 */
public class Agua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] AdministracionAgua = {
            {100, 50, 30, 120, 60}, //casa1
            {32, 122, 46, 80, 90}, //casa2
            {45, 100, 56, 26, 36}, //casa3
            {6, 110, 72, 33, 40} //casa4
        };
        Agua agua = new Agua();
        System.out.println("Consumo por Casa: ");
        agua.consumoPerCasa(AdministracionAgua);
        System.out.println("------------");
        System.out.println("Consumo por dia: ");
        agua.consumoPerDia(AdministracionAgua);
    }

    public void consumoPerCasa(int[][] AdministracionAgua) {
        int[] adicion = new int[5];
        for (int i = 0; i < AdministracionAgua.length; i++) {
            int suma = 0;
            for (int j = 0; j < AdministracionAgua[i].length; j++) {
                suma += AdministracionAgua[i][j];
            }
            adicion[i] = suma;
            System.out.println(adicion[i]);
        }
    }

    public void consumoPerDia(int[][] AdministracionAgua) {
        int[] adicion2 = new int[5];
        for (int i = 0; i < AdministracionAgua[0].length; i++) {
            int sumaDia = 0;
            for (int j = 0; j < AdministracionAgua.length; j++) {
                sumaDia += AdministracionAgua[j][i];
            }
            adicion2[i] = sumaDia;
            System.out.println(adicion2[i]);
        }
    }

}
