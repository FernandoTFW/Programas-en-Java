/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmc;

/**
 *
 * @author Fernando
 */
public class PMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El valor de pi es: " + Pet.PI);
        Pet.breed = "Schnauzer";
        System.err.println("Breed: " + Pet.breed);
        Pet myPet = new Pet();
        myPet.speak();
        myPet.speak("Guau Guau");
        Pet myDog = new Pet("Elemento",14);
        myDog.showPet();
    }
    
}
