/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter2.statements;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = {10, 45, 4, 8};
        /*
         for (int i = 0; i < tab.length; i++) {
         System.out.println("tab["+i+"] = " + tab[i]);
         }
        
         for(int e : tab)  //enhanced loop
         System.out.println(e);
         */

        //break and continue
//        outer:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j == 5) {
//                    //break;  // sortie de la boucle
//                    //continue;
//                    //break outer;
//                    continue outer;
//                }
//                System.out.println("(i,j)=("+i+" "+j+")");
//            }
//            
//        }
//        int k = -1;
//        final int x = 4;
//        switch (k) {
//            
//            
//            case 1:
//                System.out.println("1");break;
//            case x:
//                System.out.println("10");break;
//            case 100:
//                System.out.println("100");break;
//            case 1000:
//                System.out.println("1000");break;
//          default :  System.out.println("Autre");
//        }
        
        
        long x = 10;
        
        int y = (int)(2*x);
        
         System.out.println(y);
        
    }
}
