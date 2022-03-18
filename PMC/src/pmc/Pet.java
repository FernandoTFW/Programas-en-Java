/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmc;

/**
 *
 * @author Fernando
 */
public class Pet {
    //atributos
    String name;
    int age;
    //atributos estaticos
    public static final double PI = 3.1416;
    public static String breed;
    public Pet() {
    }
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    public  void speak()
    {
        System.out.println("Hello...");
    }
    public  void speak(String sound)
    {
        System.out.println(sound);
    }
    public void showPet(){
        System.out.println("Name: "+ name+" Age: " + age);
    }
    //GETTERS SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
