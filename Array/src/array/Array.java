/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Fernando
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int [5];
        numbers[3] = 18;
        numbers[4]=7;
        System.out.println("Numbers 4:" + numbers[4]);
        for(int number:numbers){
            System.out.println(number);
        }
        
        //arreglos del objeto string
        String [] names = new String [5];
        names[2]="Fernando";
        for(String name:names){
            System.out.println(name);
        }
    }
    
}
