package com.revature;

import com.revature.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //Scanner and data structs
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        String currentUser = "";
        String currentPass = "";

        System.out.println("Welcome to Flash Pass!");

        while(true){  //While loop to repeat menu process
            System.out.println("What would you like to do?");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Login status");
            System.out.println("0) Exit");
            System.out.println("Please make a selection > ");

            String userInput = scanner.nextLine(); // Get menu selection

            switch(userInput){
                case "1":
                    //New User Registration
                    System.out.println("Enter your username");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password");
                    String password = scanner.nextLine();

                    User user = new User();
                    user.username = username;
                    user.password = password;
                    users.add(user);
                    break;
                case "2":
                    //Login a user
                    System.out.println("Enter your username.");
                    String loginInput = scanner.nextLine(); //get user login input w/ scanner (1)
                    System.out.println("Enter your password.");
                    String passInput = scanner.nextLine();

                    for (User value : users) { //for loop through List users
                        if (value.username.equals(loginInput) && value.password.equals(passInput)) // if (elementUser == loginInput )
                        {
                            currentUser = loginInput;
                            currentPass = passInput;
                            System.out.println("User valid; Logged in: ");
                            break;
                        }
                    }
                    break;
                case "3": //Multiple users?
                    //Print current user
                    if(currentUser == "") {
                        System.out.println("No Users are logged in");
                    } else{
                        System.out.println("Current user is: " + currentUser);
                    }
                    break;
                case "0":
                    System.out.println("Exiting the application");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Choose only from the available menu options...");
                    break;
            }
        }
    }
}
