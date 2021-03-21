/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.pasageDeParametres;

/**
 *
 * @author amine
 */
public class NewMain {

    public static void permut(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void modifSB(StringBuilder sb) {
        sb.append("-ocp");
    }

    public static void modifSt(String st) {
       // st = st.concat("-ocp");
        st.concat("-ocp");
    }
    public static void main(String[] args) {
//        int x = 10, y = 20;
//        permut(x, y);
//        System.out.println("x = " + x); // x = 
//        System.out.println("y = " + y); // y = 

        //StringBuilder s = new StringBuilder("oca");
        //modifSB(s);
        String s = new String("oca");
        modifSt(s);
        System.out.println("s = " + s);
    }

}
