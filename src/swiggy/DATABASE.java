
package swiggy;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DATABASE {
       
           
            
                 
        
       

        boolean login_user(String username,String password) throws ClassNotFoundException
        {
           
         
                try{
                                          String url="jdbc:mysql://localhost:3306/fodder";
			  		String uname="root";
			  		String pass="root";
                                       Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection(url,uname,pass);
                        String query="select USERNAME from users where `USERNAME`=? and `PASSWORD`=?";
                        PreparedStatement st ;
                        System.out.println("login");
                        System.out.println(username+password);
                        st=con.prepareStatement(query);
                        st.setString(1, username);
                        st.setString(2, password);
                        ResultSet rs= st.executeQuery();
                        rs.next();
                        String abcd=rs.getString("USERNAME");
                        System.out.println(abcd);
                        System.out.println("successfully logged in");
                        return true;
                    }
                catch(SQLException e)
		{
			String s=e.getMessage();
			System.out.println(s);
                        return false;
		}
                    
           } 
       

  boolean create_account(String username,String password,String Fn,String Mn,String Ln,String Mno,String Email,String state,String pin,String que,String ans) throws ClassNotFoundException
  {
            
        try{
                                          String url="jdbc:mysql://localhost:3306/fodder";
			  		String uname="root";
			  		String pass="root";
                                      Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection(url,uname,pass);
                       String query="insert into users values (?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement st ;
                       // System.out.println("login");
                       // System.out.println(username+password);
                        st=con.prepareStatement(query);
                
       
                        st.setString(1, username);
                        st.setString(2, password);
                        st.setString(3,Fn);
                        st.setString(4,Mn);
                        st.setString(5,Ln);
                        st.setString(6,Mno);
                        st.setString(7,Email);
                        st.setString(8,state);
                        st.setString(9,pin);
                        st.setString(10,que);
                        st.setString(11,ans);
                        
                        int count=st.executeUpdate(); 
                       

                        System.out.println("Registerd \n");
                        return true;
                    }
         catch(SQLException e)
		{
			String s=e.getMessage();
			System.out.println(s);
		}
                   
      
      return false;
      
  }
  
  String forget_pass(String username,String Que,String Ans) throws ClassNotFoundException
  {
       try{
                                          String url="jdbc:mysql://localhost:3306/fodder";
			  		String uname="root";
			  		String pass="root";
                                      Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection(url,uname,pass);
                       String query="select PASSWORD from users where `username`=? and `question`=? and `answer`=?";
                        PreparedStatement st ;
                       // System.out.println("login");
                       // System.out.println(username+password);
                        st=con.prepareStatement(query);
                
       
                        st.setString(1, username);
                        st.setString(2, Que);
                        st.setString(3,Ans);
                   
                        
                        
                          ResultSet rs= st.executeQuery();
                          rs.next();
                         String passW;
                         passW = rs.getString("PASSWORD");
                         System.out.println(passW);
                         return passW;
                      //  System.out.println("Registerd \n");
                        
                    }
         catch(SQLException e)
		{
			String s=e.getMessage();
			System.out.println(s);
                         return null;
		}
       
       
    
                   
      
    
  }
  
     boolean add_history(String user,String Hotel_name,String[] Food_name,float[] pr,String[] qun) throws ClassNotFoundException
       {
            
            try{
                
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                 LocalDateTime now = LocalDateTime.now();
                
                
                
                
                                          String url="jdbc:mysql://localhost:3306/fodder";
			  		String uname="root";
			  		String pass="root";
                                      Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection(url,uname,pass);
                       String query;
                query = "insert into history values (?,?,?,?,?,?)";
                        PreparedStatement st ;
                       // System.out.println("login");
                       // System.out.println(username+password);
                        st=con.prepareStatement(query);
                        
                        
              int i=0;  
             while(i<=7)
             {
               if(pr[i]==0.0)
               {        
               }
               
               else {
                    st.setString(1, user);
                        st.setString(2, Hotel_name);
                        st.setString(3,Food_name[i]);
                        st.setFloat(4,pr[i]);
                        st.setString(5,qun[i]);
                        st.setString(6,now.toString());
                        
                       
                        st.setString(5,String.valueOf(pr[i]/Integer.parseInt(qun[i])));
                       int count=st.executeUpdate(); 
                      System.out.println(i);
                     
                     }
               i++;
               }
                       
                        
                     

                        System.out.println("data entered \n");
                        return true;
                    }
         catch(SQLException e)
		{
			String s=e.getMessage();
			System.out.println(s);
		}
                   
      
      return false;
       }
















}


    