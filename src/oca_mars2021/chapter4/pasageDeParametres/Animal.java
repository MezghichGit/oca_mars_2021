/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.pasageDeParametres;

import java.util.ArrayList;

/**
 *
 * @author amine
 */
public class Animal {

    private int age;
    private final ArrayList<String> foods;
    
    public Animal(int a, ArrayList<String> l)
    {
        this.age = a;
        this.foods = new ArrayList<>(l);
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getFoods() {
        return new ArrayList<>(foods);
    }
}
