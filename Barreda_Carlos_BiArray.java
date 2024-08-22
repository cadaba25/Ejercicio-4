/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoClase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_BiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = 0;
        int cuadrado[][];
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.print("Ingrese el numero de filas y columnas: ");
        tamano = lea.nextInt();
        
        cuadrado = new int[tamano][tamano];
        
        for (int filas = 0; filas < tamano; filas++) {
            for (int columnas = 0; columnas < tamano; columnas++) {
                cuadrado[filas][columnas]= 10 + random.nextInt(90);
                
            }   
            
        }
        System.out.println("Matriz=");
        for (int filas = 0; filas < tamano; filas++) {
            for (int columnas = 0; columnas < tamano; columnas++) {
                System.out.print(" "+ cuadrado[filas][columnas]+" ");
                
            }
            System.out.println(" ");
        }
        
        for (int Diagonal_1 = 0; Diagonal_1 < tamano; Diagonal_1++) {
            sumadiagonal1 += cuadrado[Diagonal_1][Diagonal_1];
            
        }
        
        for (int Diagonal_2 = 0; Diagonal_2 < tamano; Diagonal_2++) {
            sumadiagonal2 += cuadrado[Diagonal_2][tamano-1-Diagonal_2];
            
        }
        
        System.out.println("Suma diagonal principal: "+ sumadiagonal1);
        System.out.println("Suma diagonal segundaria: "+ sumadiagonal2);
    
    
    
    }
    
}
