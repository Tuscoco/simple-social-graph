package com.simplesocialgraph.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.simplesocialgraph.models.User;

public class UserDAO {
    
    private static String FILE_PATH = "data/users.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveUsersData(List<User> usersData){

        try(FileWriter fileWriter = new FileWriter(FILE_PATH)){

            gson.toJson(usersData, fileWriter);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static List<User> getUsersData(){

        try(FileReader fileReader = new FileReader(FILE_PATH)){

            User[] users = gson.fromJson(fileReader, User[].class);

            if(users != null){
                return new ArrayList<>(List.of(users));
            }else{
                return new ArrayList<>();
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
