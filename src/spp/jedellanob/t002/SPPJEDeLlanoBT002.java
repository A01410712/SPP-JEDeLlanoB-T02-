/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.t002;
import java.util.Scanner;
/**
 *
 * José Eduardo De Llano Barragán IC A01410712
 */
public class SPPJEDeLlanoBT002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valinf, valsup;
        Scanner datos= new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        valinf= datos.nextDouble();
        System.out.println("Introduce un numero superior al ingresado anteriormente");
        valsup= datos.nextDouble();
        
        
                      while(valinf <= valsup){
            if (valinf % 2 == 0)  {
         System.out.println(valinf + "   El numero es par");
     }
            else if (valinf % 3==0 && valinf % 5==0){
            System.out.println(valinf+ "   divisible entre 3 y 5");
        }
            else if(valinf % 3==0){
                System.out.println(valinf+ "  divisible entre 3");
             }
            else if(valinf % 5==0){
                System.out.println(valinf+ "   divisible entre 5");
             }
            else{
                System.out.println(valinf);
            }
            valinf++;
         }
        
 
        }  
 }
 
       
        
        
        
             



        
        // TODO code application logic here
    
