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
public class Ballena extends Mamifero implements IDesplazarse{
    double peso;
    public Ballena(double peso, boolean tienePelo, boolean tienePatas) {
        super(tienePelo, tienePatas);
        this.peso = peso;
    }
    
    public void MostrarPeso(){
        System.out.println("La ballena pesa: " + this.peso + " Tons.");
    }

    @Override
    public void Desplazarse() {
        System.out.println("La ballena se desplazó nadando");
    }
    
    
    
    
    
}
