import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {


    public static void main(String[] args) {
        System.out.println("Программа: пропущенные вызовы");
        MissedCalls missedCalls = new MissedCalls();
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(in);


        while (true) {

            System.out.println("Меню программы :");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Добавить пропущенный вызов");
            System.out.println("3. Вывести все пропущенные вызовы");
            System.out.println("4. Очистить пропущенные вызовы");
            System.out.println("5. Выход");

            int input = scanner.nextInt();
            if (input == 5) {
                System.out.println("Программа завершена");
                break;
            } else {
                switch (input) {
                    case 1 -> fiillContacst(contacts, new Scanner(in)); // Добавить контакт
                    case 2 -> addMissedCalls(missedCalls, new Scanner(in)); // Добавить пропущеный вызов
                    case 3 -> missedCalls.printMissedCalls(contacts); // Печать пропущенных вызовов
                    case 4 -> missedCalls.clear();// Стереть пропущенные вызовы
                    default -> {
                    }
                }
            }

        }
        contacts.printHashMap();

    }


    public static void fiillContacst(Contacts contacts, Scanner scanner) {
        try {

            System.out.println("Введите через запятую Имя,Фамилию, номер телефона, " +
                    "группу из имеющихся(WORK,FRIENDS,FAMILY)");

            String inputContact = scanner.nextLine();
            String[] greatNewContact = inputContact.split(",");
            String name = greatNewContact[0];
            String surname = greatNewContact[1];
            String number = greatNewContact[2];
            Group group = Group.valueOf(greatNewContact[3]);
            Contact contact = new Contact (name, surname, group);
            contacts.addContacts(number, contact);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Введите через запятую ФИО, номер телефона");

        } catch (IllegalArgumentException ex) {
            System.out.println("такой группы нет");

        }


    }

    public static void addMissedCalls(MissedCalls missedCalls, Scanner scanner) {
        System.out.println("Введите номер пропущенного вызова");
        String inputCalls = scanner.nextLine();
        missedCalls.putMissedCalls(LocalDateTime.now(), inputCalls);

    }
}
