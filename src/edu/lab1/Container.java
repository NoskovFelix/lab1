package edu.lab1;

import java.util.*;

public abstract class Container extends Item{


    public Container(String name, int weight, HashSet<String> prop){
        super(name,weight,prop);
    }

    public abstract void push(Item item);
    public abstract void pull();
    public abstract void getItemForName(String item);
}
