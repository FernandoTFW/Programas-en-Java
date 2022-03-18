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
public class Ejemplo04032022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Padre P = new Padre();
        P.MimetodoAbstracto();
        Hijo H = new Hijo();
        H.MimetodoAbstracto();
        Abuelo abuelo = new Abuelo();
        Abuelo.miMetodoEstatico();
        
    }
    
}
