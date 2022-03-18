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
public class Pantalon extends Ropa implements Idevolucion{
    String genero;
    String corte;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public Pantalon() {
    }

    public Pantalon(String genero, String corte, int id, double precio) {
        super(id, precio);
        this.genero = genero;
        this.corte = corte;
    }

    @Override
    public void devolver() {
        System.out.println("Jean devuelto con exito"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void metodoI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
