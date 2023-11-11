/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosu5;

/**
 *
 * @author expec
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class ArreglosU5 {
public static double[] promPorEstudiante(double[][] calificaciones){
        
        double[] estudiante = new double[3];
        
         for (int i = 0; i < calificaciones.length ; i++) { //Control de filas ESTUDIANTES
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) { //Control de columnas MATERIAS
               suma += calificaciones[i][j]; 
            }
            estudiante[i] = suma / 4;
        }
         
         return estudiante;
       
    }
public static double[] promPorMateria(double[][] calificaciones){
        
    double[] materia = new double[calificaciones[0].length];
    
    for (int i = 0; i < calificaciones[0].length; i++) { //Control de columnas MATERIAS
        double suma = 0;
        for (int j = 0; j < calificaciones.length; j++) { //Control de filas ESTUDIANTES
            suma += calificaciones[j][i]; 
        }
        materia[i] = suma / calificaciones.length;
    }
     
    return materia;
}

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0,78.5,92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5,91.0,87.5},
            
        };
        System.out.println("Promedio Estudiantes: ");
        double[] totalPromedios = ArreglosU5.promPorEstudiante(calificaciones);
        for (int i = 0; i < totalPromedios.length; i++) {
            System.out.println(totalPromedios[i]);
        }
        System.out.println("Promedio Materia: ");
        double[] totalPromediosMat = ArreglosU5.promPorMateria(calificaciones);
        for (int i = 0; i < totalPromediosMat.length; i++) {
            System.out.println(totalPromediosMat[i]);
        }  
    }
    
}