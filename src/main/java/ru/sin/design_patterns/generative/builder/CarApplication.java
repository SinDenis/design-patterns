package ru.sin.design_patterns.generative.builder;

import ru.sin.design_patterns.generative.builder.builder.BuilderDirector;
import ru.sin.design_patterns.generative.builder.builder.CarBuilder;
import ru.sin.design_patterns.generative.builder.builder.CarManualBuilder;

public class CarApplication {
    public void run() {
        var buildDirector = new BuilderDirector();
        var carBuilder = new CarBuilder();
        var manualBuilder = new CarManualBuilder();

        buildDirector.constructCityCar(carBuilder);
        buildDirector.constructCityCar(manualBuilder);

        System.out.println(carBuilder.getResult());
        System.out.println(manualBuilder.getResult().getInfo());
    }
}
