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
public class Ropa {
    private int id;
    private double precio;

    public Ropa() {
    }

    public Ropa(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }
    
    public void mostrarDatos() {
        System.out.println("*****************");
        System.out.println("ID: " + this.id);
        System.out.println("Precio: " + this.precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
