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
public class Child extends Dad{
    String nameChild;
    public Child() {
    }

    public Child(String nameChild) {
        this.nameChild = nameChild;
    }

    public Child(String nameChild, String nameDad, String nameGrandpa) {
        super(nameDad, nameGrandpa);
        this.nameChild = nameChild;
    }
    
    public void allMethods(){
        super.getNameGrandpa();
        super.getnameDad();
        System.out.println("Hello Child");
        System.out.println("Grandpa: " + super.nameGrandpa);
        System.out.println("Dad: " + super.nameDad);
        System.out.println("Child: " + nameChild);
    }
    
}
