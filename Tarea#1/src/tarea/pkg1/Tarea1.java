/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner streamReader = new Scanner(System.in);
        System.out.println("Insert Number");
        int number = streamReader.nextInt();
        int a =0;
        for(int i = 1;i<=number;i++){
            if(number%i==0){
                a++;
            }
        }
        if(a==2){
            System.out.println("El número es Primo");
        } else {
            System.out.println("El número no es Primo");
        }
    }
    
}
