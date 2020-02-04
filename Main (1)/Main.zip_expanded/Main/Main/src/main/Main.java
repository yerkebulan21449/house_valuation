/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author 21449
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*House coffee1 = new House();
    coffee1.setBrand("Barista");
    coffee1.setWeight(250.0);
    coffee1.setHealth("ant Rak");
    LocalDate dogBirthDate = LocalDate.of(2018,1,10);
    
    coffee1.setPrice(269);
    coffee1.setDate(dogBirthDate);
    coffee1.setCountry("Brazil");
    coffee1.setType("Espresso");
    coffee1.setTaste("Medovyi");


    House coffee2 = new House();
    coffee2.setBrand("Gurme");
    coffee2.setWeight(1001.0);
    coffee2.setHealth("head age");
    coffee2.setPrice(299);
    coffee2.setDate(dogBirthDate);
    coffee2.setCountry("Spain");
    coffee2.setType("Filtr");
    coffee2.setTaste("Myagki");
    
    House coffee3 = new House();
    coffee3.setBrand("Santos");
    coffee3.setWeight(1000.0);
    coffee3.setHealth("Bell");
    coffee3.setPrice(1099);
    coffee3.setDate(dogBirthDate);
    coffee3.setCountry("Brazil");
    coffee3.setType("filtr");
    coffee3.setTaste("Funduk");
    */

    ArrayList<House> list = new ArrayList<>();
/*
    list.add(coffee1);
 list.add(coffee2);
list.add(coffee3);*/
    System.out.println(list.size());
    //#Accessing elements from an ArrayList
        System.out.println("========= #Accessing elements from an ArrayList");
        System.out.println("First Brand: " + list.get(0).getBrand());
        System.out.println("Second brand: " + list.get(1).getBrand());

        //#Removing elements from an ArrayList
       System.out.println("========= #Removing elements from an ArrayList");
       //list.remove(2);
       // System.out.println("coffe size: " + list.size());
/*
        System.out.println("========= #Sort an ArrayList of Objects using custom Comparator");
        list.sort(new Comparator<House>() {
            @Override
            public int compare(House coffee1, House coffee2) {
                double coffee1Weight = coffee1.getWeight();
                double coffee2Weight = coffee2.getWeight();
                return (int)((coffee1Weight - coffee2Weight)*100);
            }
        });*/

 for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    // list.remove(0);
    // System.out.println(list.size());
    }

}
