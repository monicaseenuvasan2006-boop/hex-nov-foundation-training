package Day1_Assignment;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************LOGIN System***********");
        System.out.println("Username: ");
        String username = sc.next();
        System.out.println("Password: ");
        String password = sc.next();
        LoginService loginService = new LoginService();
        boolean isValid = loginService.validate(username,password);
        if(isValid){
            System.out.println("Welcome " + username);
            System.out.println("Now you can access the system");
        }
        else{
            System.out.println("Invalid Credentials..");
            System.out.println("System exit");
        }
        System.out.println("*************************************");
        sc.close();
    }
}