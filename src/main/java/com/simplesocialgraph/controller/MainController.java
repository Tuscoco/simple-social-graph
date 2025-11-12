package com.simplesocialgraph.controller;

import java.util.Scanner;
import java.util.Set;

import com.simplesocialgraph.models.User;
import com.simplesocialgraph.service.GraphService;
import com.simplesocialgraph.service.UserService;

public class MainController {
    
    private static GraphService graphService = new GraphService();
    private static UserService userService = new UserService();
    private static User myUser;

    public static void run(){

        Scanner scan = new Scanner(System.in);

        Menus.startMenu();
        int id = scan.nextInt();
        scan.nextLine();

        myUser = userService.getUserData(id);

        Menus.userMenu(myUser);
        Menus.homeMenu();
        int option = scan.nextInt();
        scan.nextLine();

        if(option == 0){
            return;
        }else if(option == 1){
            
            Set<Integer> friends = graphService.getFriends(id);

            for(Integer friendId : friends){
                System.out.println(userService.getUserData(friendId).getName());
            }
        }

        scan.close();

    }

    public static void menu(){}

}
