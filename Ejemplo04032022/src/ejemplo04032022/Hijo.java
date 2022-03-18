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
public class Hijo extends Padre{
    @Override
    public void MimetodoAbstracto() {
        System.out.println("Hola desde HIJO");
    }

    public Hijo() {
    }
    
}
