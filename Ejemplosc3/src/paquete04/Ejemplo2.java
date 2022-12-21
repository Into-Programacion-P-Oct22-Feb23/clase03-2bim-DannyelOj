/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        int f;
        int c;
        int[][] dato1 = {{1, 2, 3},{6, 8, 9}}; 
        int[][] dato2 = new int[2][3]; //
        /*
            1   4   3
            36  64  9
        */
        for(f=0; f<dato1.length; f++){
            for(c=0; c<dato1[f].length; c++){ 
                if(dato1[f][c]%2==0){
                    dato2[f][c] = dato1[f][c]*dato1[f][c];
                }else{
                   dato2[f][c] = dato1[f][c];
                }   
            }
            
        }
        
        for(f=0; f<dato1.length; f++){
            for(c=0; c<dato1[f].length; c++){ 
                System.out.printf("%d\t", dato2[f][c]);
            }
            System.out.println(); // salto de línea
        }
        System.out.println("Daniel Ojeda");
        
    }
    
}
