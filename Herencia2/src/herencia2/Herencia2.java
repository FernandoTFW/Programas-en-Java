/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Fernando
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ropa miRopa = new Ropa(101, 120);
        miRopa.mostrarDatos();
        
        Polera miPolera = new Polera("L", 102, 80);
        miPolera.mostrarDatos();
    }
    
}
