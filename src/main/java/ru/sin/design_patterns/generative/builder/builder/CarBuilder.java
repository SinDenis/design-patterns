package ru.sin.design_patterns.generative.builder.builder;

import lombok.Setter;
import lombok.ToString;
import ru.sin.design_patterns.generative.builder.model.car.Car;
import ru.sin.design_patterns.generative.builder.model.car.parts.*;

@Setter
public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
