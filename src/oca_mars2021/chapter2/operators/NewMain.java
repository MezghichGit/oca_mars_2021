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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int y = 4;
      int z = 3;
//       double x = y*(z+y)*3;
//       System.out.println("x = "+x);
       double x = 2*y -3 + ++y -y + 2 * y--; 
       
       //     x = 2*4 -3 + 5 - 5 + 2 * 5
               // = 8-3+5-5+8
       //double x = --y -3 + 3*(y +y) + 2 * y++; 
       //System.out.println("x = "+x +" y = "+y);
        
//        short x = 3;
//        short y = 2;
//        int z = x+y;
//        char a='e';
//        char b='f';
//        int w = a+b;
//        
//        int x = 1;
//        float y = 33;
//        float d = x*y;
//        System.out.println(x);    
        
//        int x = 10;
//        int y =3;
        //int y = ++x;
        //int y = x++;
        // y+=x;  // y = y+x;
        System.out.println("y ="+y);
        System.out.println("x ="+x);
    }
    
}
