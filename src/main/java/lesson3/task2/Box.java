package lesson3.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> getList() {
       return list;
    }

    private List<T> list;

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveTo(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void information() {
        if(list.isEmpty()) {
            System.out.println("Коробка пустая");
        }else {
            System.out.println("В коробке лежат " + list.get(0).toString() + " в количестве " + list.size());
        }
    }

    float getWeight() {
        if(list.isEmpty()) {
            return 0;
        }else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
