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
public class NewMain1 {

    public static void somme(int a) {
        System.out.println("int a");
    }

    public static void somme(short a) {
        System.out.println("short a");
    }

    public static void main(String[] args) {
        somme((short)2);
    }

}
