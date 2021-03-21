/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5;

import java.io.IOException;

/**
 *
 * @author amine
 */
public class Oiseau extends Animal {

    int age;

    public Oiseau() {
        //this(10);
        super(2, "toto");
    }

    public Oiseau(int a) {
        super(a, "toto");
        this.age = a + 2;
    }

    public void info() {
        System.out.println("AGE OISEAU = " + this.age + " Age Animal = " + super.age);
    }

    @Override
    public Oiseau affichage() {   //redéfinition ou Overriding
        // System.out.println("Oiseau");
        //return new Animal();
        return new Oiseau();
    }

    public void test() throws IOException // une exception vérifié(checked)
    {
    }
    
     public void test2() throws RuntimeException // une exception non vérifié(unchecked)
 {}

}
