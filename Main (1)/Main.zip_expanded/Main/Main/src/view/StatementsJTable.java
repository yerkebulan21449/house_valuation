package view;

import model.HouseModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import main.House;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;


public class StatementsJTable extends JFrame{
	   private TableRowSorter<TableModel> rowSorter;

    private DefaultTableModel statements;
    private JTable table;
    private JTable table2;
    
 public StatementsJTable(){
     JButton b1=new JButton("ADD");
      HouseModel house = new HouseModel();
JTable table = new JTable(house);
     b1.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
        	 JFrame frame = new JFrame();
        	 
        	    

        	 String[] house = {"","",""};
             //JTable target = (JTable) e.getSource();
             //int row = target.getSelectedRow();
             //int column = target.getSelectedColumn();
             //System.out.println(row+1);
             JInternalFrame editor = new JInternalFrame(
                     "Edit Record", true, true, true, true);

             GridLayout gridLayout = new GridLayout(0, 2);
             gridLayout.setHgap(5);
             gridLayout.setVgap(5);

             editor.setLayout(gridLayout);

             editor.add(new JLabel(getColumnTitle(0)));
             JTextField brand = new JTextField(20);
             brand.setText("");
             editor.add(brand);

             editor.add(new JLabel(getColumnTitle(1)));
             JTextField weight = new JTextField(20);
             weight.setText("");
             editor.add(weight);

             editor.add(new JLabel(getColumnTitle(2)));
             JTextField health = new JTextField(20);
             health.setText("");
             editor.add(health);
             
             editor.add(new JLabel(getColumnTitle(3)));
             JTextField price = new JTextField(20);
             price.setText("");
             editor.add(price);

             editor.add(new JLabel(getColumnTitle(4)));
             JTextField date = new JTextField(20);
             date.setText("");
             editor.add(date);

             editor.add(new JLabel(getColumnTitle(5)));
             JTextField country = new JTextField(20);
             country.setText("");
             editor.add(country);
             
             editor.add(new JLabel(getColumnTitle(6)));
             JTextField type = new JTextField(20);
             type.setText("");
             editor.add(type);
             editor.add(new JLabel(getColumnTitle(6)));
             JTextField cena = new JTextField(20);
             type.setText("");
             editor.add(cena);


             JButton saveButton = new JButton("Ok");
             saveButton.addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent e) {


                     House h1 = new House();


                     h1.setBrand(brand.getText());
                     h1.setWeight(weight.getText());
                     h1.setHealth(health.getText());
                     h1.setPrice(price.getText());
                     h1.setDate(date.getText());
                     h1.setCountry(country.getText());
                     h1.setType(type.getText());
                     h1.setCena(cena.getText());
                   
                     



                     ((HouseModel)table.getModel()).addHouse(h1);



                     JOptionPane.showMessageDialog(((JButton) e
                             .getSource()).getParent(), "Record Saved!");
                 }
             });
             editor.add(saveButton);

             JButton cancelButton = new JButton("Cancel");
             cancelButton.addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent e) {
                     editor.updateUI();
                     editor.hide();
                 }
             });

             editor.add(cancelButton);

             editor.pack();
             table.add(editor);
             editor.setVisible(true);
             editor.setClosable(true);

         }}

	
);
     JButton b5=new JButton("RUN");
     b5.addActionListener(new ActionListener() {@Override
    	 public void actionPerformed(ActionEvent e) {
    	 try {
             // Run the process
      	   
             Process p = Runtime.getRuntime().exec("C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Desktop\\\\\\\\Games\\\\\\\\test.bat");
             // Get the input stream
             InputStream is = p.getInputStream();
   
             // Read script execution results
             int i = 0;
             StringBuffer sb = new StringBuffer();
             while ( (i = is.read()) != -1)
                 sb.append((char)i);
   
             System.out.println(sb.toString());
   
         } catch (IOException e1) {
             e1.printStackTrace();
         }
   
         
         
     } });
     JButton b6=new JButton("Ocenka");
     b6.addActionListener(new ActionListener() {@Override
    	 public void actionPerformed(ActionEvent e) {
/*         Scanner input = new Scanner(new File("C:\\Users\\User\\Desktop\\Games\\Main (1)\\Main.zip_expanded\\Main\\Main\\src\\main\\housedatabase.db"));
*/
    	
    	 try {
             File file = new File("C:\\Users\\User\\Desktop\\Games\\text.txt");
             //создаем объект FileReader для объекта File
             FileReader fr = new FileReader(file);
             //создаем BufferedReader с существующего FileReader для построчного считывания
             BufferedReader reader = new BufferedReader(fr);
             // считаем сначала первую строку
             String line = reader.readLine();
             while (line != null) {
                 System.out.println(line);
                 
          	   JOptionPane.showMessageDialog(((JButton) e
                         .getSource()).getParent(), line);
         
                 // считываем остальные строки в цикле
                 line = reader.readLine();
             }
         } catch (FileNotFoundException e1) {
             e1.printStackTrace();
         } catch (IOException e1) {
             e1.printStackTrace();
         }
 
         

         
     } });
     JButton b2=new JButton("REMOVE"); 
     
     b2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
                
             //pets.removeRow(table.getSelectedRow());
             if(table.getSelectedRow()!= -1)
                 ((HouseModel)table.getModel()).remHouse(table.getSelectedRow());
             table.updateUI();
         }
     }
);
     
     HouseModel statements=new HouseModel();
     Container container = getContentPane();
     Container container2 = getContentPane();
     container.add(b1);
     container.add(b2);
     container.add(b5);
    // statements.addColumn("Name");
    // statements.addColumn("Lastname");
    // statements.addColumn("Age"); 
     String[] data1={"aaa","bb","20000"};
     String[] data2={"aaa","bb","20000"};
     String[] data3={"aaa","bb","20000"};
     String[] data4={"aaa","bb","20000"};
     String[] data5={"aaa","bb","20000"};
     String[] data6={"aaa","bb","20000"};
     String[] data7={"aaa","bb","20000"};
     String[] data8={"aaa","bb","20000"};
     String[] data9={"aaa","bb","20000"};
     //statements.addRow(data1); 
     //statements.addRow(data2); 
     //statements.addRow(data3); 
     //statements.addRow(data4); 
     //statements.addRow(data5); 
     //statements.addRow(data6);
    // statements.addRow(data7); 
    // statements.addRow(data8); 
     //statements.addRow(data9);
     
  
     
    

        
     rowSorter = new TableRowSorter<>(table.getModel());
     table.setRowSorter(rowSorter);
       
     
     
     JPanel inputPanel = new JPanel();
     inputPanel.add(b1);
     inputPanel.add(b2);
     inputPanel.add(b5);
     inputPanel.add(b6);
     JTextField jtfFilter = new JTextField();
     JButton jbtFilter = new JButton("Filter");
     JButton DB = new JButton("Save to DB");
     
     JPanel ocenKa = new JPanel();
     
     JPanel panel = new JPanel(new BorderLayout());
     panel.add(new JLabel("Specify a word to match:"),
             BorderLayout.WEST);
     panel.add(jtfFilter, BorderLayout.CENTER);
     panel.add(jbtFilter, BorderLayout.EAST);
     panel.add(DB, BorderLayout.WEST);  
     container2.add(new JScrollPane(table), BorderLayout.CENTER);
     container.add(new JScrollPane(table), BorderLayout.CENTER);
     container.add(inputPanel, BorderLayout.NORTH);
     container.add(panel, BorderLayout.SOUTH);
     setSize(400,200);
     setVisible(true);
     
     
     jbtFilter.addActionListener(
             new ActionListener(){

                 @Override
                 public void actionPerformed(ActionEvent e) {
                        String text = jtfFilter.getText();

             if (text.trim().length() == 0) {
                 rowSorter.setRowFilter(null);
             } else {
                 rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
             }
         
//                     cities.removeRow(table.getSelectedRow());
                       JOptionPane.showMessageDialog(((JButton) e
                                 .getSource()).getParent(), "Good Job!");
                 }
                 
             }
             
             
     );
     
     DB.addActionListener(
             new ActionListener(){

                 @Override
                 public void actionPerformed(ActionEvent e) {
            
                     System.out.println("Saving...");
                     ((HouseModel)table.getModel()).SaveToDB();
                     
                     
                 }
                 
             }
     );

 
            table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                   //JTable target = (JTable) e.getSource();
                    int row = table.getSelectedRow();
                    int column = table.getSelectedColumn();
                System.out.print(row);
                                System.out.println(column);
          JInternalFrame editorPopup = new JInternalFrame("Edit Record", true, true, true, true);
             
                    GridLayout gridLayout = new GridLayout(0, 2);
                    gridLayout.setHgap(5);
                    gridLayout.setVgap(5);

                    editorPopup.setLayout(gridLayout);                 
                     editorPopup.pack();
                        //editorPopup.add(new JLabel(getColumnTitle(0)));
                        JLabel nameLabel = new JLabel("Продажа Дома или Квартиры");
                        editorPopup.add(nameLabel);
                        JTextField brand = new JTextField(20);
                        brand.setText(table.getValueAt(row, 0).toString());
                        editorPopup.add(brand);
                        
                        JLabel weightLabel = new JLabel("Количество Комнат");
                        editorPopup.add(weightLabel);
                        JTextField weight = new JTextField(20);
                        weight.setText(table.getValueAt(row, 1).toString());
                        editorPopup.add(weight);
                        
                        JLabel healthLabel = new JLabel("В залоге");
                        editorPopup.add(healthLabel);
                        JTextField health = new JTextField(20);
                        health.setText(table.getValueAt(row, 2).toString());
                        editorPopup.add(health);
                        
                        JLabel priceLabel = new JLabel("Площадь(м2)");
                        editorPopup.add(priceLabel);
                        JTextField price= new JTextField(20);
                        price.setText(table.getValueAt(row, 3).toString());
                        editorPopup.add(price);
                        
                        JLabel dateLabel = new JLabel("Год постройки");
                        editorPopup.add(dateLabel);
                        JTextField date = new JTextField(20);
                        date.setText(table.getValueAt(row, 4).toString());
                        editorPopup.add(date);
                        
                        JLabel countryLabel = new JLabel("Город");
                        editorPopup.add(countryLabel);
                        JTextField country = new JTextField(20);
                        country.setText(table.getValueAt(row, 5).toString());
                        editorPopup.add(country);
                        
                        JLabel typeLabel = new JLabel("В центре города");
                        editorPopup.add(typeLabel);
                        JTextField type = new JTextField(20);
                        type.setText(table.getValueAt(row, 6).toString());
                        editorPopup.add(type);
                       //JLabel specialSignsLabel = new JLabel("type");
                       // editorPopup.add(specialSignsLabel);
                    //JTextField specialSigns = new JTextField(20);
                    //specialSigns.setText(table.getValueAt(row, 7).toString());
                    //editorPopup.add(specialSigns);
                JButton okButton = new JButton("Ok");
                okButton.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {

                            table.getModel().setValueAt(brand.getText(), row, 0);
                            table.getModel().setValueAt(weight.getText(), row, 1);
                            table.getModel().setValueAt(health.getText(), row, 2);
                            table.getModel().setValueAt(price.getText(), row, 3);
                            table.getModel().setValueAt(date.getText(), row, 4);
                            table.getModel().setValueAt(country.getText(), row, 5);
                            table.getModel().setValueAt(type.getText(), row, 6);
                            //table.getModel().setValueAt(specialSigns.getText(), row, 7);

                            JOptionPane.showMessageDialog(((JButton) e
                                    .getSource()).getParent(), "Record Saved!");
                        } });
                        
                        
                JButton closeButton = new JButton("close");
                closeButton.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                  	 
                        editorPopup.hide();
                    }
                });
                    editorPopup.add(okButton);
                    editorPopup.add(closeButton);
        
                    table.add(editorPopup);
                    editorPopup.setVisible(true);
                    editorPopup.setClosable(true);

                }
                
            }});
 
     
   
 }
     
 	private String getColumnTitle(int i) {
		String title = null;

        switch (i) {
            case 0:
                title = "Продажа Дома или Квартиры";
                break;
            case 1:
                title = "Количество Комнат";
                break;
            case 2:
                title = "В залоге";
                break;
            case 3:
                title = "Площадь(м2)";
                break;
            case 4:
                title = "Год постройки";
                break;
            case 5:
                title = "Город";
                break;
            case 6:
                title = "В центре города";
                break;
        }

        return title;
        
    }
    

}