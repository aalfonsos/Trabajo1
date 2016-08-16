/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println("digite su edad:");
        int num=Integer.parseInt(reader.nextLine());
        
        if(num > 0 && num <= 120){
            System.out.println(" su edad es verdadera ");
        }
        else{
            System.out.println(" su edad es imposible");
        }
    }
     
}
