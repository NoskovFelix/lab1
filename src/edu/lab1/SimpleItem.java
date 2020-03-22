package edu.lab1;

import java.util.HashSet;
import java.util.Set;

public class SimpleItem extends Item {
    private float weight;

    public SimpleItem(String name, float weight, HashSet<String> prop){
        super(name,prop);
        this.weight = weight;
    }

    public void getInfo(){
        System.out.println();
    }
}
