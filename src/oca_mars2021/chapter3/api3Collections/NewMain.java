/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api3Collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList ();
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());
//        
//        names.add("ali");
//        names.add("4");
//        names.add("true");
//        for(Object e : names)
//        {
//            String temp = (String)e;
//            System.out.println(temp.toUpperCase());
//        }
//        System.out.println(names);

        ArrayList<String> ls1 = new ArrayList<>();
        List<String> ls2 = new ArrayList<>();
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(4));
        numbers.add(16); //autoboxing
        numbers.add(null);
        int k = numbers.get(2); // unboxing
        System.out.println(numbers);
        System.out.println(k);
//        int x = numbers.get(0); //unboxing
//        
//        String moy ="12.5";
//        double val = Double.parseDouble(moy);
//        Double v = Double.valueOf(moy);
//        System.out.println(v);
//        System.out.println("val ="+(val+2));
    }

}
