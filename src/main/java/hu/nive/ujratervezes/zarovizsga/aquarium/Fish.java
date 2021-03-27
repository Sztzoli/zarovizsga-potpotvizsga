package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss = false;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Fish(String name, int weight, String color, boolean memoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = memoryLoss;
    }

    protected String status() {
        return String.format("%s, weight: %d, color: %s, short term memory loss: %s",name,weight,color, memoryLoss);
    }

    protected void increaseWeight(int amount) {
        this.weight += amount;
    }

    abstract void feed();

}
