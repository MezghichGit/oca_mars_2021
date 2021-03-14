/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter2.operators;

/**
 *
 * @author amine
 */
public class OperateurTernaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        int z = 12;
       // int k = (x<y)?100:-100; // opérateurs ternaire
        
        int l  = (x>z)?(x<y)?10:20:1;
        //System.out.println("z = "+z);
        System.out.println("l = "+l);
        System.out.println((x>y)?true:-100);
        
    }
    
}
