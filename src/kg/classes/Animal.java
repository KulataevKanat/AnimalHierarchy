package kg.classes;

import kg.interfaces.AnimalInterface;

public class Animal implements AnimalInterface {
    private String type;
    private Integer age;
    private char gender;

    public Animal() {
    }

    public Animal(String type, Integer age, char gender) {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String eat(String eat) {
        return getType() + " кушает " + eat;
    }

    @Override
    public String eat(String eat, String drink) {
        return getType() + " кушает " + eat + " и пьёт " + drink;
    }

    @Override
    public String toString() {
        return "вид животного - " + getType() + "\n" +
                "возраст животного - " + getAge() + "\n" +
                "пол животного - " + getGender() + "\n";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
