package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish {


    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    void feed() {
        super.increaseWeight(1);
    }
}
