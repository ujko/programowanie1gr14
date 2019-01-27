package day2.stream;

import day1.sorting.ListCreat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

//    private void arrayToStream(){
//        String[] table = {"Mateusz", "Monika", "Artur", "Ala", "Norbert"};
//        Predicate<String> keyWord = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length()==5;
//            }
//        };
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        Arrays.stream(table).filter(keyWord).forEach(consumer);
//    }

    public static void main(String[] args) throws IOException {
        new Main().readFromFile();

    }


    private void arrayToStream() {
        String[] table = {"Mateusz", "Monika", "Artur", "Ala", "Norbert"};

        Arrays.stream(table).filter(x -> x.length() == 5).forEach(System.out::println);
    }

    private void streamCreate() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        Stream<String> arrayStream = Stream.of("Mateusz", "Monika", "Artur", "Ala", "Norbert");
        arrayStream.forEach(System.out::println);

        Stream<String> streamBuilder = Stream.<String>builder().add("Mateusz").add("kot").add("krowa").build();
        streamBuilder
                .map(x -> x.length())
                .forEach(System.out::println);
    }

    private void method() {

        String s = ListCreat.getCars()
                .stream()
                .map(x -> x.getColor().toUpperCase())
                .collect(Collectors.joining(" - "));

        System.out.println(s);
    }

    private void method2() {
        //Stream<Integer> nameStream = Stream.generate(()-> 45).limit(10);
        IntStream nameStream = new Random(40).ints(10);
        nameStream.forEach(System.out::println);
    }
    private void readFromFile() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("c:/temp/text.txt"));
        lines.forEach(System.out::println);
    }
}
