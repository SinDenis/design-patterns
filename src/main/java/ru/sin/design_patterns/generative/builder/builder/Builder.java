package ru.sin.design_patterns.generative.builder.builder;

import ru.sin.design_patterns.generative.builder.model.car.parts.*;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GPSNavigator gpsNavigator);
}
