/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int random = (int) (Math.random() * 7 + 1);
        Scanner streamReader = new Scanner(System.in);
        System.out.println("Adivina el número(1ra Oportunidad)");
        int number = streamReader.nextInt();
        if(number==random) {
            System.out.println("Felicidades GANASTE :D");
        } else {
            if(number>random){
                System.out.println("El número es menor a: " + number);
            } else if (number<random){
                System.out.println("El número es mayor a: " + number);
            }
            System.out.println("Adivina el número(2da Oportunidad)");
            int number2 = streamReader.nextInt();
            if(number2==random) {
                System.out.println("Felicidades GANASTE :D");
            } else {
                System.out.println("Perdiste :( el número era:" + random);
            }
        }
    }
    
}
