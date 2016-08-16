/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usernames;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Usernames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      
      String user= "alex";
      String user2= "emily";
      String pass="mightyducks";
      String pass2="cat";
              
         System.out.print(" Escriba su usuario: ");
         String usuario=reader.nextLine();
   
         System.out.print(" Escriba su contraseña ");
         String p1=reader.nextLine();
         
         if(user.equals(usuario) && pass.equals(p1)){
         System.out.println( " Ha accedido al sistema ");
        
    }
         else if(user2.equals(usuario) && pass2.equals(p1)){
        System.out.println( " Ha accedido al sistema ");
    }
         else{
         System.out.println( " su usuario o contraseña son incorrectos ");
        

      }
    }
}

