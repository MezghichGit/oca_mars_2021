/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5.part2.methodsHiding;

/**
 *
 * @author amine
 */
public class TestPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PCPortable pp = new PCPortable();
       pp.info();
       
       PC p = new PC();
       p.info();
    }

}
