package cad.lab12.nomer16_13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> firstNames = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Vvedite imia: ");
            String firstName = scanner.next();
            firstNames.add(firstName);
        }

        System.out.println("Imena: " + firstNames);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.print("Vvedite imia kotoroie hotite naiti: ");
        String firstNameToSearch = scanner.next();

        boolean found = false;
        for (String firstName : firstNames) {
            if (firstNameToSearch != null && firstNameToSearch.equals(firstName)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Imia bilo naideno!");
        } else {
            System.out.println("Vi ne vvodili takoe imia!");
        }
    }
}
