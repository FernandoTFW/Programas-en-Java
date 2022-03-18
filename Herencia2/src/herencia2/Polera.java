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
public class Polera extends Ropa {
    String talla;

    public Polera() {
    }

    public Polera(String talla, int id, double precio) {
        super(id, precio);
        this.talla = talla;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Talla: " + this.talla);
        System.out.println("************************");
    }
    
}
