package lesson3.task2;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Apple> appleBox= new Box();
        Box<Apple> appleBox1 = new Box();
        Box<Orange> orangeBox = new Box();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());


        for(int i = 0; i < 5; i++) {
           appleBox1.add(new Apple());
        }

        for(int i = 0; i < 8; i ++){
            orangeBox.add(new Orange());
        }

        appleBox.information();
        appleBox1.information();
        orangeBox.information();

        Float appleWeight = appleBox.getWeight();
        Float apple1Weight = appleBox1.getWeight();
        Float orangeWeight = orangeBox.getWeight();
        System.out.println("Вес первой коробки с яблоками: " + appleWeight);
        System.out.println("Вес второй коробки с яблоками: " + apple1Weight);
        System.out.println("Вес коробки с апельсинами: " + orangeWeight);

        System.out.println("Сравнить вес первой коробки яблок и коробки с апельсинами " + appleBox.compare(orangeBox));
        System.out.println("Сравнить вес второй коробки яблок и коробки с апельсинами " + appleBox1.compare(orangeBox));

        appleBox.moveTo(appleBox1);
        //appleBox.moveTo(orangeBox); вот тут ошибка, т.к. нельзя смешивать яблоки с апельсинами в одной коробке.

        appleBox.information();
        appleBox1.information();
        orangeBox.information();

    }
}
