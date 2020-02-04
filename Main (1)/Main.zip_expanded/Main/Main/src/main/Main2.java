package main;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Double;

public class Main2 {

    public static void main(String args[]){

    ArrayList<House> list = new ArrayList<>();

    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            Scanner input = new Scanner(new File("./src/main/coffeesdatabase.db"));

            while(input.hasNextLine()){
                String line;
                House house= new House();

                line = input.nextLine();

                try{
                    Scanner data = new Scanner(line);
                    if(data.hasNext()){
                        String brand = data.next().trim();
                        house.setBrand(brand);
                    }
                       if(data.hasNext()){
                        String weight = data.next().trim();
                        house.setWeight(weight);
                    }

                    if(data.hasNext()){
                         String health = data.next().trim();
                        house.setType(health);
                    }

                    if(data.hasNext()){
                        String date = data.next().trim();
                        house.setDate(date);
                    }

                    if(data.hasNextInt()){
                        String price = data.next().trim();
                        house.setPrice(price);
                    }

                    if(data.hasNext()){
                        String country = data.next().trim();
                        house.setCountry(country);
                    }

                    if(data.hasNext()){
                        String signs = data.next();
                        for(int i = 0; i < signs.split(",").length; i++){
                            house.addSpecialSign(signs.split(",")[i]);
                        }
                    }

                }catch(Exception e){
                    System.out.println(e);
                }

                list.add(house);

            }

        }catch(IOException e){
            System.out.println(e);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println("#================================");
            System.out.println(list.get(i));
        }

        try{
            File file = new File("./src/main/outputcoffees.db");
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));

            for(int i = 0; i < list.size(); i++) {
                pw.append("\n" + list.get(i).getBrand()+"\n" + list.get(i).getType()+"\n" + list.get(i).getDate());
            }

            pw.close();

        }catch(Exception e){

        }

    }
}