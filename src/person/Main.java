package person;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        Person person1 = new Person();
        Person person2 = new Person();

        byte remainingTurns = 100;

        Game.fillSheet(person1, read);
        System.out.println("\n---------------------------\n");
        Game.fillSheet(person2, read);
        System.out.println();

        System.out.println("Press 'enter' to start ");
        read.nextLine();

        do {
            System.out.println("Turn " + (100 - remainingTurns));
            Game.printAge(person1, person2);
            Game.increaseAge(person1, person2);
            Game.printAge(person1, person2);
 
            System.out.println("Is your turn");

            remainingTurns--;
        } while (remainingTurns >= 0);
    }
}
