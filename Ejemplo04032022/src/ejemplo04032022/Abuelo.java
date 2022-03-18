/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo04032022;

/**
 *
 * @author Fernando
 */
public class Abuelo extends MiClaseAbstracta{

    static final String ESTATICO_FINAL = "Estatico final";

    public Abuelo(int ci, String nombre) {
        super(ci, nombre);
    }
    
    public void miMetodo() {
        System.out.println("datos: " + nombre);
    }
    
    public static void miMetodoEstatico () {
        System.out.println("datos: " + ESTATICO_FINAL);
    }

    @Override
    public void mimetodoAbstracto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
