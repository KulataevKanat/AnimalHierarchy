package kg.classes;

import kg.interfaces.CatInterface;

public class Cat extends Animal implements CatInterface {

    public Cat() {
    }

    public Cat(String type, Integer age, char gender) {
        super(type, age, gender);
    }

    @Override
    public String mouseCathed(Integer mouseCount) {
        return getType() + " поймал " + mouseCount + " мышей.";
    }

    @Override
    public String eat(String eat) {
        return super.eat(eat);
    }
}
