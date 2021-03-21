/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4;

/**
 *
 * @author amine
 */
public class Animal {

   final static int nb; 
   static {nb = 1;}
    
   final int age;  // package private  != private
    
    private String espece;  // visible seulement dans la classe
    
    /*{
    this.age = 10;
    }*/
    Animal(){
        this.age = 10;
        // faux this.nb = 4;
    }
    
    protected String pays;

    public double prix;
    
    void information() // visibilité : package private != private
    {
        //this.age = 1;
        System.out.println("Hello Java");
    }
    
    void info() // visibilité : package private != private
    {
        this.information();
        my();  //appel à la méthode statique
        System.out.println("Hello Java");
    }
    
    static void my()
    {
    // this.information();
    }
}
