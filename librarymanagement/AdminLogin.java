/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class AdminLogin implements Admin{
  
    boolean checkstatus=false;

    
        

    @Override
    public boolean checkLog(String name, String pass) {
       if(name.equals("admin")&& pass.equals("admin12"))
        {
            checkstatus=true;
        }
  return checkstatus;
    }
    
    /**
     *
     */
    public void openadmin()
    {  
          
          System.out.println("***********Admin Console*********");
          System.out.println("1.ADD Librarian");
          System.out.println("2. View Librarian");
          System.out.println("3.Delete librarian");
          System.out.println("$.Exit");
        }
        
    }

    

