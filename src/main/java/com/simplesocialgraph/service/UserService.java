package com.simplesocialgraph.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public Set<User> getUserData(Set<Integer> ids){

        Set<User> users = new HashSet<>();
        for(User user : usersData){

            for(Integer id : ids){
                if(user.getId() == id){
                    users.add(user);
                }
            }

        }

        return users;
    }

    public void saveUsersData(){
        UserDAO.saveUsersData(usersData);
    }

}
