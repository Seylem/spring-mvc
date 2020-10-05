package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    public static List<Car> car() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("audi", "green", 180));
        cars.add(new Car("bmw", "black", 250));
        cars.add(new Car("toyota", "pearl", 150));
        cars.add(new Car("zaz", "yellow", 97));
        cars.add(new Car("honda", "white", 178));

        return cars;
    }
}
