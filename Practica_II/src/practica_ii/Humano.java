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
public class Humano extends Mamifero implements IDesplazarse{
    String nombre;

    public Humano(String nombre, boolean tienePelo, boolean tienePatas) {
        super(tienePelo, tienePatas);
        this.nombre = nombre;
    }

    public void presentarse(){
        System.out.println("Mi nombre es: " + this.nombre);
    }
    
    @Override
    public void Desplazarse() {
        System.out.println(this.nombre+" caminó erguido");
    }
    
    
    
}
