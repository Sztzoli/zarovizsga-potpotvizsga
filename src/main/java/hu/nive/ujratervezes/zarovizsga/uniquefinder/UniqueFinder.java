package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueFinder {

    public List<Character> uniqueChars(String s) {
        if (s==null || s.isBlank()) {
            throw new IllegalArgumentException();
        }
        return s.chars()
                .distinct()
                .mapToObj(x -> (char) x)
                .collect(Collectors.toList());
    }
}
