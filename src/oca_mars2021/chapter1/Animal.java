/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter1;

/**
 *
 * @author amine
 */
public class Animal {

    String espece; // attribut d'instance
    int age; // attribut d'instance

    static int nb; // attribut de classe

    public void infoAnimal() { //méthode d'instance
        System.out.println("Espece = " + this.espece + " Age= " + this.age);
    }

    public void setAge(int v) {//méthode d'instance
        this.age = this.age + v;
    }

    public void setEspece(String v) {//méthode d'instance
        this.espece = v;
    }

    public static void getNB() {
        //age = 1; : False
        System.out.println("NB = " + nb);
    }

    public static void test() {
        //age = 1; : False
        System.out.println("test");
    }
    {
        System.out.println("Bloc 1 d'instance ");
        System.out.println("Bloc 1 Suite ");
    }

    {
        System.out.println("Bloc 2 d'instance ");
    }

    static {
        System.out.println("Bloc de classe");
    }

    public Animal(int x) // constructeur avec paramètres
    {
    }

    public Animal() // constructeur par défaut
    {
        System.out.println("Constructeur par défaut");
    }
}
