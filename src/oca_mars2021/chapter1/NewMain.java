/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter1;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal(3);
        System.out.println(Animal.nb);
        a1.infoAnimal();
        a1.nb = 10;
        System.out.println(Animal.nb);
        a2.nb = 20;
        a1.getNB();
        System.out.println(Animal.nb);
        /*int x=10; // c une variable local
        System.out.println(x);
        
        Animal.getNB();*/
        
        //Animal a1 = new Animal(); // utilise le constructeur par défaut
       // Animal a2 = new Animal(3); // utilise le constructeur avec paramètre
       /* 
        System.out.println("Espace a1 :"+ a1.espece+" Age a1: "+a1.age);
         System.out.println("**************");
        System.out.println("Espace a2 :"+a2.espece+" Age a2: "+a2.age);
        a1.setAge(2);
        a1.setEspece("Chat");
        
        a2.setAge(1);
        a2.setEspece("Oiseau");
        
        a1.infoAnimal();
        a2.infoAnimal();*/
       
        
    }
    
}
