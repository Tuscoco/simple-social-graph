package com.simplesocialgraph.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.simplesocialgraph.dao.RelationDAO;
import com.simplesocialgraph.models.Relation;

public class GraphService {
    
    private Map<Integer, Set<Integer>> graph = new HashMap<>();

    public GraphService(){
        for(Relation relation : RelationDAO.getRelationsData()){    
            addEdge(relation.getOrigin(), relation.getDestination());
        }
    }

    public void addEdge(int user1, int user2){
        graph.computeIfAbsent(user1, k -> new HashSet<>()).add(user2);
        graph.computeIfAbsent(user2, k -> new HashSet<>()).add(user1);
    }

    public Set<Integer> getFriends(int userId){
        return graph.getOrDefault(userId, Set.of());
    }

    public void exportGraph(){

        List<Relation> relations = new ArrayList<>();

        for(Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()){

            Integer key = entry.getKey();
            Set<Integer> setEntry = entry.getValue();

            for(Integer set : setEntry){
                relations.add(new Relation(key, set));
            }

        }

        RelationDAO.saveRelationsData(relations);
    }

}
