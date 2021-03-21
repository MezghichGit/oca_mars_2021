/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author amine
 */
public class PredicateArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("oca");
        names.add("ocp");
        names.add("full stack");
        System.out.println(names);
        Predicate<String> p = (String s) -> {
            return s.startsWith("o");
        };
        names.removeIf(p);
        System.out.println(names);
    }

}
