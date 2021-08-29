package ru.sin.design_patterns.generative.builder.builder;

import lombok.Setter;
import ru.sin.design_patterns.generative.builder.model.car.CarManual;
import ru.sin.design_patterns.generative.builder.model.car.parts.*;

@Setter
public class CarManualBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarManual getResult() {
        return new CarManual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
