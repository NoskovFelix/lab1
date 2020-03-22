package edu.lab1;
import java.util.*;

public class Bag extends Item{
    private float weight = 10;

    public Bag(String name,float weight,HashSet<String> prop){
        super(name,prop);
        this.weight = weight;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Вес: " + weight);
    }




}
