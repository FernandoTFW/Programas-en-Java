/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner streamReader = new Scanner(System.in);
        System.out.println("Insert name of Student");
        String name = streamReader.nextLine();
        System.out.println("Insert 1st Parcial Score");
        double parcial1 = streamReader.nextDouble();
        System.out.println("Insert 2nd Parcial Score");
        double parcial2 = streamReader.nextDouble();
        double score = (parcial1*0.35)+(parcial2*0.35);
        System.out.println("Name: " + name);
        if(score>=51){
            System.out.println("you passed :D");
        } else {
            if(score<=20){
                System.out.println("you failed :(");
            } else {
                double neededScore = (51 - score);
                System.out.println("you have to get "+ neededScore +" points in the final grade to pass");
            }
        }
    }
    
}
