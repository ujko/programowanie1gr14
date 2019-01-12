package day1.stream;

import day1.sorting.Car;
import day1.sorting.ListCreat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    List<Car> list = ListCreat.getCars();

    public static void main(String[] args) {
        Main main = new Main();
        List<Car> carsByColor = main.findByColor("yellow");
        List<Car> carsByPrice = main.findByPrice(120000, 145000);
//        carsByColor.forEach(System.out::println);
        carsByPrice.forEach(System.out::println);
    }

    private List<Car> findByColor(String color) {
//        Stream<Car> cars =  list.stream();
//        cars.forEach(System.out::println);

        return list.stream()
                .filter(x -> x.getColor().equals(color))
                .collect(Collectors.toList());
    }

    private List<Car> findByPrice(int priceMin, int priceMax) {

        return list.stream()
                .filter(x -> x.getPrice() < priceMax && x.getPrice() > priceMin)
                .collect(Collectors.toList());
    }


//    private List<Car> findByColor(String color) {
//        List<Car> listCar = new ArrayList<>();
//        for (Car car: list){
//            if(car.getColor().equals(color)){
//                listCar.add(car);
//            }
//        }
//        return listCar;
//    }

}

