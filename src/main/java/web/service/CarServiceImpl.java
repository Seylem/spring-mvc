package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    public static List<Car> car() {
        Car car1 = new Car("audi", "green", 180);
        Car car2 = new Car("bmw", "black", 250);
        Car car3 = new Car("toyota", "pearl", 150);
        Car car4 = new Car("лада седан", "баклажан", 97);
        Car car5 = new Car("honda", "white", 178);

        List<Car> cars = new ArrayList<>();

            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
            cars.add(car4);
            cars.add(car5);

        return cars;
    }
}
