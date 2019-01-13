package day1.sorting;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String color;
    private String name;
    private int maxSpeed;
    private double price;
    private String producer;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }

    public Car(String color, String name, int maxSpeed, double price, String producer) {
        this.color = color;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public int compareTo(Car o) {
        int a = producer.compareToIgnoreCase(o.getProducer());
       if (a==0){
          a = name.compareToIgnoreCase(o.getName());
       }
       return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        //if (maxSpeed != car.maxSpeed) return false;
        //if (Double.compare(car.price, price) != 0) return false;
        //if (color != null ? !color.equals(car.color) : car.color != null) return false;
       // if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return producer != null ? producer.equals(car.producer) : car.producer == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + maxSpeed;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        return result;
    }
}
