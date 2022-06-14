package lesson4.task2;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", "12345");
        phoneBook.add("Сидоров", "8123");
        phoneBook.add("Иванов", "891234");
        phoneBook.add("Ржевский", "8901243");
        phoneBook.add("Попов", "891246");
        phoneBook.add("Безухов", "81244");
        phoneBook.add("Попов", "1274");
        phoneBook.add("Иванов", "238987");
        phoneBook.add("Рабинович", "6428012");
        phoneBook.add("Николаев", "3627912");
        phoneBook.add("Рабинович", "7923462");
        System.out.println("-----------------");


        System.out.println("Номер Рабиновича: " + phoneBook.get("Рабинович"));
        System.out.println("Номер Ржевского: " + phoneBook.get("Ржевский"));
        System.out.println("-----------------");


        System.out.println("Когда в справочнике нет записи:");
        System.out.println(phoneBook.get("Ростова"));
        System.out.println("-----------------");

        System.out.println("Запишем повторный контакт:");
        phoneBook.add("Попов", "1274");
    }
}
