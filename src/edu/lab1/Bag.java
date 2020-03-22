package edu.lab1;
import java.util.*;

public class Bag implements OperationsWithCollections{
    private String name;
    private float weight = 10;
    private HashSet<Object> bag = new HashSet<Object>();

    public Bag(String name,float weight){
        this.name = name;
        this.weight = weight;
    }


    public void push(Object obj){
        bag.add(obj);
    }

    public void pull(Object obj){

    }
    public void getItemForName(String name){

    }
    @Override
    public String toString(){

    }
    public void getBag(){
        System.out.println(bag);
    }



}
