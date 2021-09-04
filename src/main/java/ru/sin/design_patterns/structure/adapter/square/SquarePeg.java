package ru.sin.design_patterns.structure.adapter.square;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class SquarePeg {
    private double width;
}
