/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter1.lestypes_primitifs;

/**
 *
 * @author amine
 */
import java.util.*;

public class NewMain {

    public static void info(Personne p) {
    }

//    public static void somme(int... tab) {
//        System.out.println("var args");
//    }
//
//    public static void somme(int a, int b) {
//        System.out.println("int  a, int b");
//    }
//    public static void somme(Integer a, Integer b) {
//        System.out.println("Integer  a, Integer b");
//    }
    public static void main(String[] args) {
        Etudiant e = new Etudiant();
        Personne p = new Personne();
        Employer emp = new Employer();
        info(e);
        info(p);
        info(emp);
        //somme();
        //somme(1, 2);
        //somme(10,4,5,8);
        //byte x =-129;
        //System.out.println(x);

        
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> tabs = new ArrayList<>();
//
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
        
        System.out.println(Integer.MAX_VALUE);
        //2_147_483_647
        System.out.println(Long.MAX_VALUE);
        
        //9223372036854775807
        
        long val = 1_854_775_807;
        //float y = 12;
        //float y = 9_223_372_036_854_775_806L;
        
        //9.223372E18
       // System.out.println(y);
        
//        byte x =(byte)7000;
//        System.out.println(x);
//        
//        int num = 10_000_000;
//        float taille = 1_2.5F;
        
        double x1 = 0X18EF; //0X.... / dans la base hexadécimale
        System.out.println(x1);
        
        int x2 = 0b10;  // dans la base binaire
        System.out.println(x2);
        
       int x3 = 010;  // dans la base octale
        System.out.println(x3);
    }

}
