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
public abstract class MiClaseAbstracta {
    int ci;
    String nombre;
    final double PI = 3.1416;

    public MiClaseAbstracta(int ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
    }
    
    public abstract void mimetodoAbstracto();
    
}
