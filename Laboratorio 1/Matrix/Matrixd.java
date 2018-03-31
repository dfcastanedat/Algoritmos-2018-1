/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrixd;
import java.io.File;
import java.util.*;
import java.lang.*;
public class Matrixd {

    public static int[][] crearmatriz(int tamaño,int valor){
        int matriz[][] = new int[tamaño][tamaño];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    
    public static int[][] dotmatriz(int [][] matriz1,int [][] matriz2){
        int matriz3[][] = new int [matriz1.length][matriz2[0].length];
        for(int i=0; i<matriz3.length; i++){
             for(int j=0;j<matriz3[i].length;j++){
                 for(int k =0; k< matriz1.length;k++){
                     matriz3[i][j]+= matriz1[i][k]*matriz2[k][j]; 
                 }
             }
        }       
        return matriz3;
    }
    
    public static void imprimirmatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 100;
        long tempo0, tempo1;
        double duracion;
        double [] arreglodetiempos= new double[n-1];
        for (int i = 2; i < n+1; i++) {
            int A [][] = crearmatriz(i, 2);
            int B [][] = crearmatriz(i, 1);
            int C [][] = crearmatriz(i, 0);
        
        double auxi = 0;
        for (int j = 0; j < 10; j++) {
            tempo0=System.nanoTime();
            C = dotmatriz(A, B);
            tempo1=System.nanoTime();
            duracion = (tempo1-tempo0)/(2*(Math.pow((double)i, 3.0)));
            auxi = auxi+duracion;      
        }
        arreglodetiempos[i-2]=(auxi/10.0)*(1*(Math.pow(10, -9)));
        }
        for (int i = 0; i < arreglodetiempos.length; i++) {
            System.out.println("Para n=10"+arreglodetiempos[i]);
        }
        
    }
}
