package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    private static long CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Model1", "Number1"));
        cars.add(new Car(++CARS_COUNT, "Model2", "Number2"));
        cars.add(new Car(++CARS_COUNT, "Model3", "Number3"));
        cars.add(new Car(++CARS_COUNT, "Model4", "Number4"));
        cars.add(new Car(++CARS_COUNT, "Model5", "Number5"));
    }

    public List<Car> printCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
