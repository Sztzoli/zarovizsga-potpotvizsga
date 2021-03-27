package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class DaVinciCode {
    public int encode(String path, char x) {
        if (x != '1' && x != '0' && x != 'x') {
            throw new IllegalArgumentException();
        }
        try (Stream<String> s = Files.lines(Path.of(path))) {
            return (int) s.flatMapToInt(String::chars)
                    .filter(c -> c == x)
                    .count();
        } catch (IOException ioe) {
            throw new IllegalStateException("Cnnot read file", ioe);
        }
    }
}
