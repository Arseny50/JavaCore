package lesson3.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        String[] array = {"Один", "Два", "Три","Четыре" ,"Пять"};
        System.out.println("Массив до замены элементов местами: " + Arrays.toString(array));
        List<String> a = Arrays.asList(array);
        Collections.swap(a, 0, 4);
        System.out.println("Массив после замены элементов местами: " + Arrays.toString(array));
    }
}
