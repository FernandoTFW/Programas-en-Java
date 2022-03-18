/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Fernando
 */
public class Clases {
    //DECLARACION
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avenger ironMan;
        ironMan = new Avenger();
        ironMan.name = "Iron Man";
        ironMan.ability = "Mechanical suit";
        ironMan.power = 1000;
        ironMan.showData();
        
        Avenger hackEye,Hulk = new Avenger();
        
    }
    
}

