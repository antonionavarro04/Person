package person;

public class Person {
    private String name;
    private int age;
    private double money;
    private int work;

    public static int[] listOfJobs = {
        0, 1, 2, 
    };

    public Person() {
        // Default Constructor
    }

    public Person(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Person(String name, int age, double money, int work) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public void setAll(String name, int age, double money, double weight, double height, int work) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.work = work;
    }

    public void printSheet() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Money: " + this.money);
        System.out.println("Work: " + this.work);
    }

    public void pay(double cost) {
        this.money -= cost;
    }

    public void steal(Person person) {
        double stealedMoney = (Math.random() * (person.money - 0) + 0);
        stealedMoney = Math.ceil(stealedMoney * 100) / 100;
        person.money -= stealedMoney;
        person.setMoney(person.money);
        System.out.println("You have stealed: " + stealedMoney);
        this.money += stealedMoney;
    }

    public void addMoney(Person person, double income) {
        person.setMoney(person.getMoney() + income);
    }
}
