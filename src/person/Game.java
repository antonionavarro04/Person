package person;

import java.util.Scanner;
import java.lang.Thread;
import java.io.FileReader;

public class Game {
    public static void availableJobs() {
        System.out.println("Available jobs:");
        try {
            FileReader fileReader = new FileReader("lib/jobs.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println("Error: " + e);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e);
                }
            } fileReader.close();
            System.out.println();
        } catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
    }

    public static void fillSheet(Person person, Scanner read) {
        boolean accepted = false;

        System.out.print("Enter your name: ");
        person.setName(read.nextLine());
        System.out.print("Enter the age of " + person.getName() + ": ");
        person.setAge(read.nextInt());
        System.out.print("Enter the money of " + person.getName() + ": ");
        person.setMoney(read.nextDouble()); read.nextLine(); // ? Buffer Clean
        System.out.println("'w' for a list of available jobs, enter to continue");
        System.out.print(">>> ");
        if (read.nextLine().equals("w")) {
            Game.availableJobs();
        }
        do {
            System.out.print("Enter the work of " + person.getName() + ": ");
            int choosenJob = read.nextInt(); read.nextLine(); // ? Buffer Clean
            for (int job : Person.listOfJobs) {
                if (choosenJob == job) {
                    person.setWork(choosenJob);
                    accepted = true;
                    break;
                }
            }
        } while (!accepted);
    }

    public static void increaseAge(Person person1, Person person2) {
        person1.setAge(person1.getAge() + 1);
        person2.setAge(person2.getAge() + 1);
    }

    public static void printAge(Person person1, Person person2) {
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");
    }
}
