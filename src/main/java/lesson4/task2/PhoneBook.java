package lesson4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, List <String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add (String surname, String phonenumber) {
        if(book.containsKey(surname)) {
            List<String> phonenumbers = book.get(surname);
            if(!phonenumbers.contains(phonenumber)){
                phonenumbers.add(phonenumber);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", phonenumber, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", phonenumber, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(phonenumber)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", phonenumber, surname));
        }
    }

        public List<String> get(String surname) {
            if(book.containsKey(surname)) {
                return book.get(surname);
            } else {
                System.out.println("В справочнике нет записи с фамилией: " + surname);
                return new ArrayList<>();
            }
        }
    }
