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
public class FoodItem {
    public int price, quantity;
    
       String[] food_array = new String[8];
        String[] food_price = new String[8];
       
       
    public String[] getfood()
    {
          
        food_array[0]="Roti and Rice";
        food_array[1]="Rice";
        food_array[2]="Rgg rice";
        food_array[3]="Edli Vada";
        food_array[4]="Puri bagi";
        food_array[5]="Masala Rice";
         food_array[6]="Maggie";
          food_array[7]="Veg biriyani";
        
        return food_array;
        
    }
     public String[] getprice()
    {
          
        food_price[0]="10";
        food_price[1]="20";
        food_price[2]="30";
        food_price[3]="50";
        food_price[4]="98";
        food_price[5]="89";
        food_price[6]="120";
        food_price[7]="55";
        return food_price;
        
    }
    
    float getsum(float[] a)
    {   float total=0;
        for(int i=0;i<a.length;i++)
        {
            total=a[i]+total;
        }
        return total;
            
    }
}




