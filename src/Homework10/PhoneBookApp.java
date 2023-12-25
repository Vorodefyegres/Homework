package Homework10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookApp {
    private static Map<String, String> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Phone Book ===");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Просмотреть все контакты");
            System.out.println("3. Обновить контакт");
            System.out.println("4. Поиск по имени");
            System.out.println("5. Выход");

            System.out.print("Выберите действие (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewAllContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    System.out.println("Выход из приложения. До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();

        phoneBook.put(name, phoneNumber);
        System.out.println("Контакт добавлен: " + name + ", " + phoneNumber);
    }

    private static void viewAllContacts() {
        System.out.println("=== Все контакты ===");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void updateContact() {
        System.out.print("Введите имя для обновления: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.print("Введите новый номер телефона: ");
            String newPhoneNumber = scanner.nextLine();
            phoneBook.put(name, newPhoneNumber);
            System.out.println("Контакт обновлен: " + name + ", " + newPhoneNumber);
        } else {
            System.out.println("Контакт с именем " + name + " не найден.");
        }
    }

    private static void searchByName() {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Контакт найден: " + name + ", " + phoneBook.get(name));
        } else {
            System.out.println("Контакт с именем " + name + " не найден.");
        }
    }
}