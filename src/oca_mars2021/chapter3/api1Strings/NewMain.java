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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int x = 10;
//        double moy = 18.5;
//        String formation = "oca";   // dans le pool
//        String cours = new String("oca");// dans le heap
//        String training = "oca"; // dans le pool
//
//        System.out.println(formation);
//        System.out.println(cours);

        //System.out.println(formation == cours);     //false
        //System.out.println(formation == training);  //true
        
//        System.out.println(formation.equals(training));  //true
//        System.out.println(formation.equals(cours));  //true
//        
//        
//        Animal a = new Animal();  // dans le heap
//        a.id = 10;
//        Animal a2 = new Animal();   // dans le heap
//        a2.id = 10;
//        
//        System.out.println(a==a2);  //false
//        System.out.println(a.equals(a2));//false
        
//        StringBuilder sh = new StringBuilder("oca");
//        sh.append("ocp");
//        
//        System.out.println("sh ="+sh);
//        String ch = "oca";
////        ch = ch.concat("ocp");
//        System.out.println(ch.concat("ocp"));
//        System.out.println(ch);
        
//        System.out.println("abc"+4+2);
//        System.out.println(4+2+"abc");
//        
//        int three = 3;
//        String four = "4";
//        System.out.println(1+2+three + four);
// 
        /*
        StringBuilder s = new StringBuilder(8);
        System.out.println(s.capacity()); //8
        System.out.println(s.length()); //0
        s.append("abcdefght");
        System.out.println(s.capacity()); //8
        System.out.println(s.length()); //6
                */
        
        String c = "oca";
        StringBuilder test = new StringBuilder(c);
        //c = test; INTERDIT
        test.reverse();
        c = test.toString();
        System.out.println("c = "+c);
    }

}
