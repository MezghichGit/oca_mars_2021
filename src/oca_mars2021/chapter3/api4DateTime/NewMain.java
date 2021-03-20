/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api4DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // partie 1 : Création now() ou of()
        LocalDate ld = LocalDate.now();
//        LocalDate ld2 = LocalDate.of(2014, Month.MARCH, 10);
//        LocalDate ld3 = LocalDate.of(2014, 4, 10);
//        System.out.println(ld);
//        System.out.println(ld2);
//        System.out.println(ld3);
//        
        LocalTime lt = LocalTime.now();
//        LocalTime lt1 = LocalTime.of(15, 58, 30);
//        System.out.println(lt);
//        System.out.println(lt1);
//        
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
        
        System.out.println(ld);
        //System.out.println(ld.plusYears(3));
        //System.out.println(ld.minusYears(4));
        
        DateTimeFormatter f = 
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT) ; 
        System.out.println(ld.format(f));
         System.out.println(f.format(ld));
    }

}
