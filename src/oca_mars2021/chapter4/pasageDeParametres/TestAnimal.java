/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.pasageDeParametres;

import java.util.ArrayList;

/**
 *
 * @author amine
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> f = new ArrayList<>();
        f.add("fish");
        f.add("meat");
        Animal a = new Animal(2,f);
        System.out.println(a.getFoods());
        f = a.getFoods();
        f.clear();
        System.out.println(a.getFoods());
    }
    
}
