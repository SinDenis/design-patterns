package ru.sin.design_patterns.structure.adapter;

import lombok.RequiredArgsConstructor;
import ru.sin.design_patterns.structure.adapter.round.RoundPeg;
import ru.sin.design_patterns.structure.adapter.square.SquarePeg;

@RequiredArgsConstructor
public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg squarePeg;

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
