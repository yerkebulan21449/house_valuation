/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.swing.table.AbstractTableModel;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;


import java.time.LocalDate;
import main.House;

//import main.Coffee;
/**
 *
 * @author kurs
 */
public class HouseModel extends AbstractTableModel{
  String[] columnNames ;
  Object[][] data;
public HouseModel() { 
columnNames = new String[] {"Продажа Дома или Квартиры", "Количество Комнат", "В залоге", "Площадь(м2)", "Год постройки", "Город", "В центре города", "Цена"};
        ArrayList<House> houses = new ArrayList<>();
    
DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//C:\Users\User\workspace\Main.zip_expanded\Main\Main\src\main
//./src/main/
        try{
            Scanner input = new Scanner(new File("C:\\Users\\User\\Desktop\\Games\\Main (1)\\Main.zip_expanded\\Main\\Main\\src\\main\\housedatabase.db"));

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
                        house.setHealth(health);
                    }
                    if(data.hasNext()){
                        String price = data.next().trim();
                        house.setPrice(price);
                    }
                    if(data.hasNext()){
                        String date = data.next().trim();
                        house.setDate(date);
                    }

                   
                    if(data.hasNext()){
                        String country = data.next().trim();
                        house.setCountry(country);
                    }
                    if(data.hasNext()){
                        String type = data.next().trim();
                        house.setType(type);
                    }
                    if(data.hasNext()){
                        String cena = data.next().trim();
                        house.setCena(cena);
                    }

                    if(data.hasNext()){
                        String signs = data.next();
                        for(int i = 0; i < signs.split(" ").length; i++){
                            house.addSpecialSign(signs.split(" ")[i]);
                        }
                    }

                }catch(Exception e){
                    System.out.println(e);
                }

                houses.add(house);

            }

        }catch(IOException e){
            System.out.println(e);
        }

       /* for(int i = 0; i < list.size(); i++) {
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

        }catch(Exception e){}*/

       data = new Object[houses.size()][8];

        for (int i = 0; i < houses.size(); i++) {

            data[i][0] = houses.get(i).getBrand();
            data[i][1] = houses.get(i).getWeight();
            data[i][2] = houses.get(i).getHealth();
            data[i][3] = houses.get(i).getPrice();
            data[i][4] = houses.get(i).getDate();
            data[i][5] = houses.get(i).getCountry();
            data[i][6] = houses.get(i).getType();
            data[i][7] = houses.get(i).getCena();
        }

    
}  
public void addHouse(House house){
    //System.out.println(artpic);
    Object[][] newData = new Object[data.length+1][columnNames.length];
    for(int i=0;i<data.length;i++){
        newData[i][0]=data[i][0];
        newData[i][1]=data[i][1];
        newData[i][2]=data[i][2];
        newData[i][3]=data[i][3];
        newData[i][4]=data[i][4];
        newData[i][5]=data[i][5];
        newData[i][6]=data[i][6];
        newData[i][7]=data[i][7];
    }

    newData[data.length][0] = house.getBrand();
    newData[data.length][1] = house.getWeight();
    newData[data.length][2] = house.getHealth();
    newData[data.length][3] = house.getPrice();
    newData[data.length][4] = house.getDate();
    newData[data.length][5] = house.getCountry();
    newData[data.length][6] = house.getType();
    newData[data.length][7] = house.getCena();
    data=newData;
}
public void remHouse(int rowID){
    //System.out.println(rowID);
    Object[][] newData = new Object[data.length-1][7];

    int t = 0;
    for(int i=0;i<data.length;i++){
        if(i!=rowID){
            newData[t][0]=data[i][0];
            newData[t][1]=data[i][1];
            newData[t][2]=data[i][2];
            newData[t][3]=data[i][3];
            newData[t][4]=data[i][4];
            newData[t][5]=data[i][5];
            newData[t][6]=data[i][6];
            newData[t][7]=data[i][7];
            t++;
        }
    }
    data = newData;
}
/*public boolean runScript() {return false;}*/
public boolean SaveToDB(){

    try{
      File file = new File("C:\\\\Users\\\\User\\\\Desktop\\\\Games\\\\housedatabase.csv");
      PrintWriter pw = new PrintWriter(new FileOutputStream(file, false));
                  
      for (int i =0; i<data.length; i++){
       for(int j = 0; j<data[0].length;j++){
           pw.print(data[i][j] + ", ");
       }   
       pw.println();
      }
      pw.println();
      pw.close();
    }catch(Exception b){
                      System.out.print(b);
                  }
     
    
     return false;
     
 }
@Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return data.length;
    }

    @Override
    public String getColumnName(int col) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return columnNames[col];

    }
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return columnNames.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return data[rowIndex][columnIndex];

    }
      public void setValueAt(Object value, int row, int col) {

        data[row][col] = value;
        fireTableCellUpdated(row, col);

    }
}
