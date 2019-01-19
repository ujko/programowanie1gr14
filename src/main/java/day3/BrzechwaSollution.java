package day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BrzechwaSollution {

    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("brzechwa.txt"))
        .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .map(x -> x + ",");
//                .forEach(System.out::println);
        Files.write(Paths.get("brzechwaNew.txt"), (Iterable<String>) lines::iterator);
    }



}
