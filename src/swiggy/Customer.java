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

    
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Customer {
public String Fname;
public String Mname;
public String Lname;
public String state;
public String pin;
public String mobilenum;
private String password;
private String username;
public String Question;
public String Ans;
public String email;

 private static Customer instance = new Customer();

   //make the constructor private so that this class cannot be
   //instantiated
   private Customer(){}

   //Get the only object available
   public static Customer getInstance(){
      return instance;
   }



    public Customer(String username, String email,String Fname,String Mname,String Lname,String Question,String pin,String mobilenum,String state,String Ans,String password) {
        this.username = username;
        this.email = email;
        this.Fname=Fname;
        this.Mname=Mname;
        this.Lname=Lname;
        this.Question=Question;
        this.pin=pin;
        this.mobilenum=mobilenum;
        this.state=state;
        this.Ans=Ans;
        this.password=password;    
    }

   

   





    
    void oder()
    {
       
    new offline().setVisible(true);
    }
    
    void login()
    {
         new Login_page().setVisible(true);
    }
    void register()
    {
        new Create_account().setVisible(true);
    }
    void pay(String a)
    {
        new Payment(a).setVisible(true);
    }  
    void view_history() throws ClassNotFoundException, SQLException
    {
        new History().setVisible(true);
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}


   
