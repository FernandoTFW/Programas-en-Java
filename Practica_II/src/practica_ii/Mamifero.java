/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_ii;

/**
 *
 * @author Fernando
 */
public class Mamifero {
    boolean tienePelo;
    boolean tienePatas;
    final String DESCRIPCION = "Soy un mamífero";

    public Mamifero(boolean tienePelo, boolean tienePatas) {
        this.tienePelo = tienePelo;
        this.tienePatas = tienePatas;
    }
    
    public void sonido(){
        System.out.println("******* Sonidos de mamífero ******");
    }
    
    public static  void comer() {
        System.out.println("El mamífero ha comido");
    }
}
