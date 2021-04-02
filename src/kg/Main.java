package kg;

import kg.classes.Animal;
import kg.classes.Cat;
import kg.classes.Sheep;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("ANIMAL:");
        main.animal_work();
        System.out.println("\nCAT:");
        main.cat_work();
        System.out.println("\nSHEEP:");
        main.sheep_work();

    }

    private void animal_work() {
        System.out.println("Constructor work:");
        Animal animal = new Animal("Animal", 1, 'M');
        System.out.println(animal.toString());

        System.out.println("Getter & Setter work:");
        Animal animals = new Animal();
        animals.setType("Animal_Type");
        animals.setAge(13);
        animals.setGender('M');
        System.out.println(animals.toString());

        System.out.println("Method work:");
        System.out.println(animals.eat("animal_feed"));

    }

    private void cat_work() {
        System.out.println("Constructor work:");
        Cat cat = new Cat("Cat", 1, 'M');
        System.out.println(cat.toString());

        System.out.println("Getter & Setter work:");
        Cat cats = new Cat();
        cats.setType("Кот");
        cats.setAge(9);
        cats.setGender('M');
        System.out.println(cats.toString());

        System.out.println("Method overload work:");
        //eukanuba - это кошачий корм (название)
        System.out.println(cats.eat("eukanuba", "молоко"));

        System.out.println("\nMethod work:");
        System.out.println(cats.mouseCathed(5));


    }

    private void sheep_work() {
        System.out.println("Constructor work:");
        Sheep sheep = new Sheep("Sheep", 1, 'M');
        System.out.println(sheep.toString());

        System.out.println("Getter & Setter work:");
        Sheep sheeps = new Sheep();
        sheeps.setType("Баран");
        sheeps.setAge(5);
        sheeps.setGender('M');
        System.out.println(sheeps.toString());

        System.out.println("Method overload work:");
        //eukanuba - это кошачий корм (название)
        System.out.println(sheeps.eat("сено", "воду"));

        System.out.println("\nMethod work:");
        System.out.println(sheeps.purpose("цели"));


    }
}
