/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.lambdaExpression;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicule v = (String s) -> {
            return s.contains("oca");
        };
        Vehicule v2 = (String s) -> {
            return s.startsWith("oca");
        };
        System.out.println(v.test("formation oca java8"));
        System.out.println(v2.test("formation oca java8"));

    }

}
