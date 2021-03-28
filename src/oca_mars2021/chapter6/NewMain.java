/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amine
 */
public class NewMain {

    public static void info() throws IOException {  //Checked
     throw new IOException();
    }

    public static void test() throws RuntimeException { //UnChecked
    }

    //public static void main(String[] args) throws Exception {
      public static void main(String[] args)  {  
        test();
      
        try {
            info();
        } catch (IOException ex) {
           // Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        ex.printStackTrace();
        }
      
        
        int x = 10;
        int y = 0;
        //String ch = "oca";
        String ch = null;
/*
        try {
            System.out.println("x/y = " + x / y);
            System.out.println(ch.length());
        } /*catch (NullPointerException e) {

         //System.out.println("Pointeur Null");
         //e.printStackTrace();
         System.out.println(e.getMessage());
         } catch (ArithmeticException e) {

         //System.out.println("Pointeur Null");
         //e.printStackTrace();
         System.out.println(e.getMessage());
         }  catch (Exception e) {

            //System.out.println("Pointeur Null");
            e.printStackTrace();
            // System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("Suite du programme....");
            System.out.println("autre");
        }*/
 System.out.println("Suite du programme....");
    }

}
