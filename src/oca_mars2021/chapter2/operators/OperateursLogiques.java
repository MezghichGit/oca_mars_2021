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
public class OperateursLogiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        boolean t1 = true;
        boolean t2 = false;
        
        //boolean res = t1 && t2;
        boolean res = t1 || t2;*/
        
        int x = 10;
        int y = 1;
        int z = 2;
        //boolean res = (   (x<y)  &  (++z>x)   );
         boolean res = (   (x>y) ||  (++z>x)   );
        
        System.out.println("res = "+res);
        System.out.println("z = "+z);
    }
    
}
