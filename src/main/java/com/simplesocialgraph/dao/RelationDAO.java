package com.simplesocialgraph.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.simplesocialgraph.models.Relation;

public class RelationDAO {
    
    private String FILE_PATH = "data/relations.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void saveRelationsData(List<Relation> relations){

        try(FileWriter fileWriter = new FileWriter(FILE_PATH)){

            gson.toJson(relations, fileWriter);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public List<Relation> getRelationsData(){

        try(FileReader fileReader = new FileReader(FILE_PATH)){

            Relation[] relations = gson.fromJson(FILE_PATH, Relation[].class);

            if(relations != null){
                return new ArrayList<>(List.of(relations));
            }else{
                return new ArrayList<>();
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
