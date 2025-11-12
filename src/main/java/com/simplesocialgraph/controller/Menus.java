package com.simplesocialgraph.controller;

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

}
