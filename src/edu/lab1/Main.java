package edu.lab1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>();
        str.add("легкий");
        str.add("тяжелый");
        Bag bag = new Bag("bag",10,str);
        bag.getInfo();




    }
}
