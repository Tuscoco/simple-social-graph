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

        int option = -1;
        Menus.clear();
        do{

            Menus.userMenu(myUser);
            Menus.homeMenu();
            option = scan.nextInt();
            scan.nextLine();
            Menus.clear();

            if(option == 0){
                break;
            }else if(option == 1){
                
                Set<User> friends = userService.getUserData(graphService.getFriends(id));
                Menus.friendsMenus(friends);

            }else if(option == 2){

                Set<User> recomendation = userService.getUserData(graphService.getRecomendation(id));
                Menus.recomendationMenu(recomendation);

            }

        }while(option != 0);

        scan.close();

    }

    public static void menu(){}

}
