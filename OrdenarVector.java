 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package ordenanumeros;
 
 import java.util.Scanner;
 
 /**Declaracion de la clase OrdenaVector
 *@author  Gabriel
 * @author Alejandra
 * @version 3/03/2017
 */
  public class OrdenarVector {
      
  
      public int vector[];
      /**Metodo que solicita los datos
       */
     
     public void pedirVector(){
       Scanner leer = new Scanner(System.in);
       int longitud;
       int cont1;//contador del for
       System.out.print("Digite la longitud del vector: ");
       longitud = leer.nextInt();
        vector = new int[longitud];
        for(cont1=0;cont1< vector.length;cont1++){
            System.out.println("Ingrese un Numero: ");
          vector[cont1] = leer.nextInt();
               
        }
      }
      //metodo que ordena el vector por medio  del metodo de  la burbuja
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
     //metodo de impresion del vector 
     public void impresion(){
         
         System.out.println("El vector ordenado de Mayor a Menor: ");
          for(int cont3=0;cont3<vector.length;cont3++){
              System.out.println(vector[cont3]);
          }
 
         
      }
      
      
     public static void main(String[] args) {
         // Ejecuta los metodos llamados 
         OrdenarVector ov = new OrdenarVector();
       
         ov.pedirVector();
         ov.ordenarVector();
         ov.impresion();
     }
     
 }