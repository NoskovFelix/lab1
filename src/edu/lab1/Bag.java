package edu.lab1;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Bag extends Container{
    private List<Item> set = new ArrayList<>();
    private int max_weight;
    private int current = 0;
    public Bag(String name, int weight,HashSet<String> prop,int max_weight){
        super(name,weight,prop);
        this.max_weight = max_weight;
    }

    public int all_weight(){
        return current + super.getWeight();
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Max weight = " + max_weight);
        System.out.println("======================================");
        System.out.println("Объекты внутри: ");
        System.out.println("======================================");
        for (Item it: set){
            it.getInfo();
            System.out.println("--------------------");
        }

        System.out.println("Текущий вес = " + current);
        System.out.println("Максимальный предельный вес = " +max_weight);
        System.out.println("Вес мешка с предметами = " + all_weight());
    }
    @Override
    public void push(Item obj){
        if (obj.equals(this)){
            System.out.println("Нельзя положить объект в самого себя");
        }
        else if (current == max_weight)
            System.out.println("Достигнут предельный вес мешка");
        else if (current + obj.getWeight() > max_weight) {
            System.out.println("Объект " + obj.getName() + " не помещается в мешок");
        }
        else {
            set.add(obj);
            super.getItemsStatus()
            current += obj.getWeight();
        }
    }
    @Override
    public void pull(){
//        int size = set.size();
        if (set.isEmpty()) {//size==0){
            System.out.println("нечего удалять");
        }
        else {
            int rnd = ThreadLocalRandom.current().nextInt(0,set.size());

            System.out.println("```````````````````");
            System.out.println("Извлекается предмет: " + set.get(rnd).getName());
            set.get(rnd).getInfo();
            System.out.println("```````````````````");
            current -= set.get(rnd).getWeight();
            set.remove(rnd);
        }


    }
    @Override
    public void getItemForName(String name){
        for (Item item: set){
            if (item.getName().equals(name)) {
                item.getInfo();
                break;
            }

        }
    }







}
