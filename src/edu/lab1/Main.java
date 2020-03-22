package edu.lab1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>();
        str.add("легкий");
        str.add("тяжелый");

        SimpleItem item = new SimpleItem("Кирпич",10.2f,str);

        Bag bag = new Bag("Bag",30);
        bag.push(item);
        bag.getBag();






    }
}
