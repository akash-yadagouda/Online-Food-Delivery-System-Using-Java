/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swiggy;

/**
 *
 * @author Akash
 */
public class Hotel_names {
    
    
      String[] hotel_name = new String[8];
        String[] hotel_address = new String[8];
      FoodItem foo = new FoodItem();
        
          public String[] gethotel_names()
    {
          
        hotel_name[0]="Panjurli";
        hotel_name[1]="Canara";
        hotel_name[2]="Taj";
        hotel_name[3]="Kabab Factory";
        hotel_name[4]="Laxmi";
        hotel_name[5]="KFC";
         hotel_name[6]="McD";
          hotel_name[7]="Drink lab";
        
        return hotel_name;
        
    }
     public String[] gethotel_address()
    {
          
        hotel_address[0]="10";
        hotel_address[1]="20";
        hotel_address[2]="30";
        hotel_address[3]="50";
        hotel_address[4]="98";
        hotel_address[5]="89";
        hotel_address[6]="120";
        hotel_address[7]="55";
        return hotel_address;
        
    }

    private FoodItem FoodItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
