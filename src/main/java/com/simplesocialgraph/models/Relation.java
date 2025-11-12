package com.simplesocialgraph.models;

public class Relation {
    
    private int origin;
    private int destination;

    public int getOrigin(){
        return origin;
    }
    public void setOrigin(int origin){
        this.origin = origin;
    }

    public int getDestination(){
        return destination;
    }
    public void setDestination(int destination){
        this.destination = destination;
    }

}
