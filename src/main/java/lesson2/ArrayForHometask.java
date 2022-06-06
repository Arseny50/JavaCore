package lesson2;

import java.util.Arrays;

public class ArrayForHometask {

    public static void main(String[] args) {
        String[][] arrayForHometask = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + arrayForHometask[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        try {
            try {
                int result = Method.method(arrayForHometask);
                System.out.println("Сумма всех элементов массива равна " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Массив должен быть [4][4]!");
            }
        }
        catch (MyArrayDataException e) {
                System.out.println("Некорректное значение массива");
                System.out.println("Ошибка в " + e.i + e.j);
            }
        }
    }
