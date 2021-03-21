/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.lambdaExpression;

import java.util.function.Predicate;

/**
 *
 * @author amine
 */
public class TestOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calcul c1 = (int a, int b)->{return a+b;};  // la version complète
       Calcul c2 = (a,b)->{return a+b;}; 
       Calcul c3 = (a,b)-> a*b;   // la version réduite
       
       System.out.println(c3.operation(10,3));
       
       Predicate<String> p = s ->{return s.length()>=4;};
       
        System.out.println(p.test("ocaOCP"));
    }
    
}
