/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;


import java.time.LocalDate;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 21449
 */
public class House {
private String brand;
    private String weight;
    private String health;
    private String price;
    private String date;
    private String country;
    private String type;
    private String cena;
        private ArrayList<String> specialSigns = new ArrayList<>();


    public String getBrand() { //������
      return this.brand;
      }

    public String getWeight() { //������
      return this.weight;
      }
 public String getHealth() { //������
      return this.health;
      }

    public String getPrice() { //������
      return this.price;
      }
      public String getDate() { //������
      return this.date;
      }

    public String getCountry() { //������
      return this.country;
      }
 public String getType() { //������
      return this.type;
      }

    public String getCena() { //������
      return this.cena;
      }
    
    

    public void setBrand(String brand) { //������
      this.brand=brand;
   }
    public void setWeight(String weight) { //������
      this.weight=weight;
}
     public void setHealth(String health) { //������
      this.health=health;
   }
    public void setPrice(String price) { //������
      this.price=price;
}
     public void setDate(String date) { //������
      this.date=date;
   }
    public void setCountry(String country) { //������
      this.country=country;
}
     public void setType(String type) { //������
      this.type=type;
   }
    public void setCena(String cena) { //������
      this.cena=cena;
}
    public ArrayList<String> getSpecialSigns() {
        return specialSigns;
    }

    public void addSpecialSign(String specialSign) {

        this.specialSigns.add(specialSign);
    }
    public String toString(){
        String sSigns = "";
        for(String sign : this.specialSigns){
            sSigns = sSigns + sign + ",";
        }

        return "Brand:" + this.brand
        +"\nHouse weight:" + this.weight
        +"\nHouse health:" + this.health
        +"\nHouse price:" + this.price
        +"\nHouse date:" + this.date
        +"\nHouse country:" + this.country
        +"\nHouse type:" + this.type
        +"\nHouse cena:" + this.cena
                        +"\nSpecial signs:" + sSigns;


    }

  

   
}
