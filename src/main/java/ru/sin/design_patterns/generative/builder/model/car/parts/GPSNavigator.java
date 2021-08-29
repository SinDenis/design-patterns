package ru.sin.design_patterns.generative.builder.model.car.parts;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GPSNavigator {
    private final String route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
}
