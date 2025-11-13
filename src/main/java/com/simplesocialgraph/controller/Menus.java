package com.simplesocialgraph.controller;

import java.util.Set;

import com.simplesocialgraph.models.User;

public class Menus {
    
    private static final String LINE = "╔══════════════════════════════════════════════════════════════════════╗";
    private static final String END  = "╚══════════════════════════════════════════════════════════════════════╝";

    public static void startMenu(){
        System.out.println(LINE);
        System.out.println("║                   🚀 Welcome to the Tuscocos Social Graph!           ║");
        System.out.println("║----------------------------------------------------------------------║");
        System.out.println(END);
        System.out.print("👉 Your ID: ");
    }

    public static void userMenu(User user){
        System.out.println(LINE);
        System.out.println("║ID: " + user.getId() + " -- Name: " + user.getName());
        System.out.println(END);
    }

    public static void homeMenu(){

        System.out.println(LINE);
        System.out.println("║   [0] Quit                                                           ║");
        System.out.println("║   [1] My friends                                                     ║");
        System.out.println("║   [2] Recommendation                                                 ║");
        System.out.println(END);
        System.out.print("👉 Choose an option: ");

    }

    public static void clear(){
        System.out.println("\n\n\n\n\n\n\n");
    }

    public static void friendsMenus(Set<User> friends){
        System.out.println(LINE);
        for(User friend : friends){
            System.out.println("║ " + friend.getName());
        }
        System.out.println(END);
    }

    public static void recomendationMenu(Set<User> recomendation){
        System.out.println(LINE);
        for(User recomend : recomendation){
            System.out.println("║ " + recomend.getName());
        }
        System.out.println(END);
    }

}
