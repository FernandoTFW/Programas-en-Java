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
public class Avenger {
    String name,ability;
    int power;

    public Avenger() {
        power = 5;
    }
    
    public void showData() {
        System.out.println("name: " + this.name);
        System.out.println("Ability: " + this.ability);
        System.out.println("Power: " + this.power);
    }
}
