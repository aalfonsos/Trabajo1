/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggernumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Biggernumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("digite el numero 1:");
        int num1=Integer.parseInt(reader.nextLine());
        
        System.out.println("digite el numero 2:");
        int num2=Integer.parseInt(reader.nextLine());
        
        if(num1<num2){
            System.out.println(num2 +  " es mayor que " +  num1);
        
           
        }
        else if(num1==num2){
            System.out.println(num1 +  " es igual que " + num2);}
        
        else {
            System.out.println(num1 + " es mayor que " + num2);
      }
    
   }
}
