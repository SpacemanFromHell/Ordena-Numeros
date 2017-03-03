/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 * @author Alejandra
 * @version 1.0
 * 
 */
public class OrdenarVector {
    
    public int vector[];
    /**
     */
    
    public void pedirVector(){
      Scanner leer = new Scanner(System.in);
      int longitud;
      int cont1;//contador del for
      System.out.print("Digite la longitud del vector: ");
      longitud = leer.nextInt();
      vector = new int[longitud];
      for(cont1=0;cont1<vector.length;cont1++){
          System.out.print("Ingrese un Numero: ");
          vector[cont1] = leer.nextInt();      
      }
    }
    
    public void ordenarVector(){
        int cont2;
        int ordenar;
        for(cont2=0;cont2<vector.length;cont2++){
            for(int cont1=0;cont1<vector.length-1-cont2;cont1++){
                if(vector[cont1]>vector[cont1+1]){
                        
                    ordenar = vector[cont1];
                    vector[cont1]=vector[cont1+1];
                    vector[cont1+1] = ordenar;                                
                   }   
            }
        }      
    }
    
    public void impresion(){
        
        System.out.println("El vector ordenado de Mayor a Menor: ");
        for(int cont3=0;cont3<vector.length;cont3++){
            System.out.println(vector[cont3]);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        OrdenarVector ov = new OrdenarVector();
      
        ov.pedirVector();
        ov.ordenarVector();
        ov.impresion();
    }
    
}
