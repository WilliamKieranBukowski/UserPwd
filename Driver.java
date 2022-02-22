package com.revature;

import com.revature.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        String currentUser = "";
        String currentPass = "";

        System.out.println("Welcome to Flash Pass!");


        while(true){
            System.out.println("What would you like to do?");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Print who is logged in");
            System.out.println("0) Exit");

            String userInput = scanner.nextLine();
            int x = 5;

            switch(userInput){
                case "1":
                    System.out.println("Enter your username.");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password.");
                    String password = scanner.nextLine();

                    User user = new User();
                    user.username = username;
                    user.password = password;
                    users.add(user);
                    break;
                case "2":
                    System.out.println("Enter your username.");
                    String loginInput = scanner.nextLine(); //get user login input w/ scanner (1)
                    System.out.println("Enter your password.");
                    String passInput = scanner.nextLine();

                    //System.out.println(passInput);

                    for (User value : users) {
                        if (value.username.equals(loginInput) && value.password.equals(passInput)) // if (elementUser == loginInput )
                        {
                            currentUser = loginInput;
                            currentPass = passInput;
                            System.out.println("User valid; Logged in: ");
                            break;
                        }
                    }

                    //TODO: Implement User Log In (1)
                    // receiving a user's input (2)
                    // checking them against the existing user list
                    // log them in -> come up with a way to track WHO is currently logged in
                    break;
                case "3":
                    // TODO: print who is currently logged in
                    System.out.println("Current user is: " + currentUser);
                    break;
                case "0":
                    System.out.println("Exiting the app");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please only choose from the available menu options.");
                    break;
            }
        }
    }
}
