package lesson4.task1;

import java.util.*;

public class ArrayForThe1stTask {

    public static void main(String[] args) {
        ArrayList<String> randomName = new ArrayList<>();
        randomName.add("Ресторан");
        randomName.add("Почта");
        randomName.add("Запчасти");
        randomName.add("Магазин");
        randomName.add("Аптека");
        randomName.add("Автосервис");
        randomName.add("Кинотеатр");
        randomName.add("Магазин");
        randomName.add("Рынок");
        randomName.add("Заправка");
        randomName.add("Кафе");
        randomName.add("Ресторан");
        randomName.add("Аптека");
        randomName.add("Заправка");
        randomName.add("Кафе");
        randomName.add("Кинотеатр");
        randomName.add("Котельная");
        randomName.add("Магазин");
        System.out.println("Изначальный массив: " + randomName);


        Set<String> uniqueWords = new HashSet<String>(randomName);

        System.out.println("Уникальные слова: " + uniqueWords);
        for (String key : uniqueWords) {
            System.out.println("Количество встречающихся слов: " + key + " " + Collections.frequency(randomName, key)
            + " Раз(а)");
        }
    }
}

