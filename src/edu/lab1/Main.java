package edu.lab1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        HashSet<String> prop = new HashSet<>();
        List<Item> cont = new ArrayList<>();
        Queue<Item> queue = new LinkedList<>();
        prop.add("тест1");
        prop.add("тест2");

        Item item1 = new Item("Кирпич", 1, prop);
        Item item2 = new Item("Камень", 2, prop);
        Item item3 = new Item("Бревно", 3, prop);
        Item item4 = new Item("Спичка", 2, prop);

        Bag bag = new Bag("Мешок",2,prop,10);
        Bag bag2 = new Bag("Мешок",1,prop,10);
        bag.push(item1);
        bag.push(item2);
        bag.push(item3);
        bag.push(item4);
        bag.push(bag2);
        bag.push(bag2);
        //bag.push(bag);
        //bag.getInfo();

        //bag.pull();

       // bag.getInfo();
        //bag.getItemForName(item1.getName());

        HashSet<String> flat = new HashSet<>();
        flat.add("плоский");
        flat.add("тяжёлый");

        Item item5 = new Item("Кирпич", 1, flat);
        Item item6 = new Item("Камень", 2, flat);
        Item item7 = new Item("Бревно", 3, flat);
        Item item8 = new Item("Спичка", 2, prop);

        Stack stack = new Stack("Стопка",0,flat,queue,4);
        stack.push(item5);
        stack.push(item6);
        stack.push(item7);
        stack.push(item8);

        stack.getInfo();
        //stack.pull();
        //stack.pull();
        //stack.getInfo();
        //stack.getItemForName(item5.getName());


        Box box = new Box("Коробка",1,flat,10);

        Item item9 = new Item("Кирпич", 1, flat);
        Item item10 = new Item("Камень", 2, flat);
        Item item11 = new Item("Бревно", 3, flat);
        Item item12 = new Item("Спичка", 1, prop);

        box.push(item9);
        box.push(item10);
        box.push(item11);
        box.push(bag2);
        //box.getInfo();






    }



}
