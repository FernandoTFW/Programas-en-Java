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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrandPa abuelo = new GrandPa("Juan");
        abuelo.grandpaMethod();
        Dad papa = new Dad("Jose");
        papa.grandpaMethod();
        Child nino = new Child("Pepe","Juan","Mateo");
        nino.allMethods();
    }
    
}
