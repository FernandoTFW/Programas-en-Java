/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Fernando
 */
public class GrandPa {
    String nameGrandpa ;
    public GrandPa() {
    }

    public GrandPa(String nameGrandpa) {
        this.nameGrandpa = nameGrandpa;
    }
    
    public void grandpaMethod(){
        System.out.println("Hello Grandpa");
    }
    public void getNameGrandpa(){
        System.out.println(nameGrandpa);
    }
}
