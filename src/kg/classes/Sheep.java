package kg.classes;

import kg.interfaces.SheepInterface;

public class Sheep extends Animal implements SheepInterface {

    public Sheep() {
    }

    public Sheep(String type, Integer age, char gender) {
        super(type, age, gender);
    }

    @Override
    public String purpose(String purpose) {
        return getType() + " достиг " + purpose;
    }

    @Override
    public String eat(String eat) {
        return super.eat(eat);
    }
}
