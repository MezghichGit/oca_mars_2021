/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amine
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Oiseau o = new Oiseau(10);
//        o.info();
//        o.affichage();
//        
//        Animal a = new Animal();
//        a.affichage();
        
        Animal a1 = new Oiseau();
        a1.affichage();
        
        a1.test2();
        try {
            a1.test();
        } catch (Exception ex) {
           // Logger.getLogger(TestAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
