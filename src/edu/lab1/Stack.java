package edu.lab1;

import java.util.*;

public class Stack extends Container {
    private Queue<Item> queue = new LinkedList<>();
    private int max_items;
    public Stack(String name, int weight, HashSet<String> prop,Queue<Item> queue, int max_items){
        super(name,weight,prop);
        this.queue = queue;
        this.max_items = max_items;
    }

    @Override
    public void push(Item item) {
        queue.offer(item);
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Max items = " + max_items);
        System.out.println("======================================");
        System.out.println("Объекты внутри: ");
        System.out.println("======================================");
        for (Item it: queue){
            it.getInfo();
            System.out.println("--------------------");
        }
    }
    @Override
    public void pull() {
        queue.poll();
    }
    @Override
    public void getItemForName(String item){
        for (Item it: queue){
            if (it.getName().equals(item)) {
                it.getInfo();
                System.out.println("Объект " + it.getName() + " находится в стопке");
                break;
            }

        }
    }
}
