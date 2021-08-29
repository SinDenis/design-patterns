package ru.sin.design_patterns.generative.builder.model.car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import ru.sin.design_patterns.generative.builder.model.car.parts.*;

@ToString
@Getter
@RequiredArgsConstructor
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private final double fuel = 0;
}
