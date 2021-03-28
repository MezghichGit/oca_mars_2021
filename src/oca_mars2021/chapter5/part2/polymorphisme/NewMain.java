/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5.part2.polymorphisme;

/**
 *
 * @author amine
 */
public class NewMain {

    public static void infoAnimal(Animal a)  // polymorphisme générique
    {
    
    }
    
    public static void infoVehiclue(Vehicule v) // polymorphisme générique
    {}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poisson p = new Poisson();
        
        Poisson p2 = new Poisson();
       
        Animal a = new Animal();
         a = p2; //UpCasting
        //1) 
        p=(Poisson)a;  //DownCasting
        //2) 
        //a=p;
        
        infoAnimal(new Oiseau()); //UpCasting
        infoAnimal(new Poisson());
        infoAnimal(new Animal());
        
         infoVehiclue(new Moto());
         infoVehiclue(new Voiture());
         
         Vehicule tab[] = new Vehicule[2];
         tab[0]= new Moto();
         tab[1] = new Voiture();
    }
    
}
