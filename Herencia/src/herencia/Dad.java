/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Fernando
 */
public class Dad extends GrandPa{
    String nameDad;

    public Dad(String nameDad) {
        this.nameDad = nameDad;
    }

    public Dad() {
    }

    public Dad(String nameDad, String nameGrandpa) {
        super(nameGrandpa);
        this.nameDad = nameDad;
    }
    public void getnameDad(){
        System.out.println(nameDad);
    }
}
