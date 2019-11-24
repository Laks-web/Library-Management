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

public class LoginConsole {

    public static void main(String[] args) {
        boolean loginStatus = false;
        int n = 0;
        int cout = 0;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("********Menu *********");
            System.out.println("1.Admin login");
            System.out.println("2. librarian Login ");
            System.out.println("3. exit");
            System.out.println("Enter the number");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    AdminLogin admin = new AdminLogin();
                    do{
                    System.out.println("Enter  username");
                    String name = sc.next();
                    System.out.println("Enter password");
                    String pass = sc.next();
                    loginStatus = admin.checkLog(name, pass);

                    if (loginStatus) {
                        admin.openadmin();

                    } else {
                        System.out.println("Try Again");

                        cout = cout + 1;

                        if (cout == 2) {

                            System.out.println("Account will be locked after 2 invalid attempts for 30 minutes.");
                        }
                    }
                    }while(cout!=2);

                    break;
                case 2:
                    System.out.println("librarian login");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("wrong number ");
                    break;

            }

        } while (n != 3);

    }

}
