package hu.nive.ujratervezes.zarovizsga.aquarium;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();

    public List<Fish> getAquarium() {
        return new ArrayList<>(aquarium);
    }

    public void addFish(Fish fish) {
        aquarium.add(fish);
    }


    public void feed() {
        aquarium.forEach(Fish::feed);
    }


    public void removeFish() {
        List<Fish> deletedFish = new ArrayList<>();
        aquarium.stream()
                .filter(x -> x.getWeight() >= 11)
                .forEach(deletedFish::add);
        aquarium.removeAll(deletedFish);
    }

    public List<String> getStatus() {
        return aquarium.stream()
                .map(Fish::status)
                .collect(Collectors.toList());
    }
}
