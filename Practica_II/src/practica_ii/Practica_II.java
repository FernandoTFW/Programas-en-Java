/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_ii;

/**
 *
 * @author Fernando Daniel Aparicio Estrada y Jaider Alejandro Pinto Ribera
 */
public class Practica_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero miMamifero = new Mamifero(true, true);
        
        Ballena elBallenato = new Ballena(2.5, false, false);
        
        Humano miHumano = new Humano("Jaider", true, true);
        
        Gato Azrael = new Gato("Perza",true,true);
        
        miHumano.presentarse();
        miHumano.Desplazarse();
        
        elBallenato.MostrarPeso();
        elBallenato.Desplazarse();
    }
    
}
