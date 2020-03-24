package edu.lab1;

import java.util.*;

public class Stack extends Container {
    private Queue<Item> queue = new LinkedList<>();
    private int max_items;
    private int items_count = 0;
    public Stack(String name, int weight, HashSet<String> prop,Queue<Item> queue, int max_items){
        super(name,weight,prop);
        this.queue = queue;
        this.max_items = max_items;
    }

    @Override
    public void push(Item item) {
       // boolean flag = false;
        for (String it: item.getProp()){
            if (it.equals("плоский")){
                if (item.equals(this)){
                    System.out.println("Нельзя положить объект в самого себя");
                }
                else if (items_count > max_items){
                    System.out.println("Достигнул лимит добавления предметов");
                }
                else {
                    queue.offer(item);
                    items_count++;
                }
                break;
            }


        }

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
        if (queue.size() == 0){
            System.out.println("нечего удалять");
        }
        else {
            queue.poll();
            items_count--;
        }

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
