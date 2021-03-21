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
public class Animal {
  int age;
  String name;
  
  public Animal()
  {
      System.out.println("UN ANIMAL");
  }
  
  public Animal(int a, String n)
  {
      System.out.println("UN ANIMAL avec paramètres");
      this.age = a;
      this.name = n;
  }
  
 protected  Animal affichage()
 {
     System.out.println("Animal");
     return new Animal();
 }
 
 public void test() throws Exception  // une exception vérifié(checked)
 {}
 
  public void test2() throws  NullPointerException // une exception non vérifié(unchecked)
 {}
}
