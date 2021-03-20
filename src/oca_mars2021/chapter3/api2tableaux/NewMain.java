/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api2tableaux;
import java.util.Arrays;
/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //int tab[];  // declaration d'un tableau d'entiers
       
       //int tab2 [] = {1,4,3};
       int tab2 [] = new int[5];
       int [] tab3 = {1,4,3};
       System.out.println(tab2.length);
       System.out.println(tab2[0]);
//       System.out.println(tab2[1]);
//       System.out.println(tab2[2]);
       System.out.println(tab2[3]);
       
       String names[] = new String[4]; // tableau d'objets
       names[0] ="Marouen";
       names[1] ="Walid";
      System.out.println(names[3]);
//       
       System.out.println(names);
       
//       Moon[] planets = new Moon[3];
//       planets[0] = new Moon("Earth",3);
//       planets[1] = new Moon("Mars",2);
//       planets[2] = new Moon("Venus",4);
//       
//       System.out.println(planets); //[Loca_mars2021.chapter3.api2tableaux.Moon;@15db9742
//       System.out.println(planets[1]); //oca_mars2021.chapter3.api2tableaux.Moon@6d06d69c
//       System.out.println(planets[1].name);//Mars
       
//       String tab[] = {"10","9","100"};
//       
//       for(String s : tab)
//       {
//            System.out.print(s+" ");
//       }
//       Arrays.sort(tab);
//        System.out.print(" ");
//       for(String s : tab)
//       {
//            System.out.print(s+" ");
//       }
       
       //Les tableaux multi-dim
       
       int t[][] = new int[3][4];
       
       int []myTab[] = new int[3][];
       myTab[0] = new int[4];
       myTab[1] = new int[2];
       myTab[2] = new int[3];
       
       // remplissage du premier tab
        myTab[0][0] = 10;
        myTab[0][1] = 11;
        myTab[0][2] = 12;
        myTab[0][3] = 13;
       // remplissage du deuxième tab
        myTab[1][0] = 20;
        myTab[1][1] = 21;
        
        // remplissage du troisième tab
        myTab[2][0] = 30;
        myTab[2][1] = 31;
        myTab[2][2] = 32;
    }
    
}
