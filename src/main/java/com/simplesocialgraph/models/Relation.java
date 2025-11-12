package com.simplesocialgraph.models;

public class Relation {
    
    private int origin;
    private int destination;

    public Relation(int origin, int destination){
        this.origin = origin;
        this.destination = destination;
    }

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
