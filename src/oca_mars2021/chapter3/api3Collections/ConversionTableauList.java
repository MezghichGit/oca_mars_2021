/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api3Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author amine
 */
public class ConversionTableauList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         String tab[] = {"oca", "ocp"};
         // conversion de tableau vers list
         List l = Arrays.asList(tab);
         //l.add("spring");
         //l.remove(0);
         l.set(0, "spring");
         System.out.println(l);
         */
        // conversio d'une liste vers un tableau
        List l = new ArrayList<>();
        l.add("oca");
        l.add("ocp");
        l.add("spring");
        Object tab[] = new Object[2];
        tab = l.toArray();
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        //System.out.println(tab[3]);
    }

}
