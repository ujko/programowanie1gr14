package day6.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

    List<Dog> dogList = new ArrayList<>();

    public Test() {
        dogList.add(new Dog(1, "azorek1"));
        dogList.add(new Dog(2, "azorek2"));
        dogList.add(new Dog(3, "azorek3"));
        dogList.add(new Dog(4, "azorek4"));
        dogList.add(new Dog(5, "azorek5"));
    }

    public void method1(){
        Optional<Dog> optional = dogList.stream()
                .filter(x-> x.getId()==3)
                .findFirst();
        Dog d = optional.orElse(new Dog(6,"azor"));

        Optional<Dog> newOptional = Optional.of(new Dog(7, "azorek7"));
    }
}
