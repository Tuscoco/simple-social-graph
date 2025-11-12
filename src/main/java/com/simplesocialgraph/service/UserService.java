package com.simplesocialgraph.service;

import java.util.List;

import com.simplesocialgraph.dao.UserDAO;
import com.simplesocialgraph.models.User;

public class UserService {
    
    private List<User> usersData;

    public UserService(){
        this.usersData = UserDAO.getUsersData();
    }

    public void createUser(User user){
        if(user != null){
            usersData.add(user);
        }
    }

    public User getUserData(int id){

        for(User user : usersData){
            if(user.getId() == id){
                return user;
            }
        }

        return null;
    }

    public void saveUsersData(){
        UserDAO.saveUsersData(usersData);
    }

}
