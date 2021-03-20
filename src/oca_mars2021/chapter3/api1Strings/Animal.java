/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api1Strings;

/**
 *
 * @author amine
 */
public class Animal extends Object{
int id;

@Override
 public boolean equals(Object obj) {
     Animal a =(Animal) obj;
        return (this.id == a.id);
    }
}
