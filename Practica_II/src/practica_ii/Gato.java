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
public class Gato extends Mamifero implements IDesplazarse{
    String raza;
    
    public Gato(String raza, boolean tienePelo, boolean tienePatas) {
        super(tienePelo, tienePatas);
        this.raza = raza;
    }

    @Override
    public void Desplazarse() {
        System.out.println("El gato se desplazó en 4 patas");
    }
    
    
    
}
