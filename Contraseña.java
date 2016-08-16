/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
      String pass= "carrot";
      String frase= "jryy qbar";
      
        for(int x=0; x<3; x++){
         System.out.print(" Escriba la costraseña: ");
         String contr=reader.nextLine();  
         
         if(contr.equals(pass)){
             System.out.print(" la frase secreta: " + frase);
             break;
         }
         else{
             System.out.println(" la contraseña es incorrecta ");
         }
        }
      }
    }