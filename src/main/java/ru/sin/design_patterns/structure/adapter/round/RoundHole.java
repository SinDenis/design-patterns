package ru.sin.design_patterns.structure.adapter.round;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class RoundHole {
    private double radius;

    public Boolean fits(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
