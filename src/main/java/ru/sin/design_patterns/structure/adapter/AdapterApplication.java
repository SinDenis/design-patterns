package ru.sin.design_patterns.structure.adapter;

import ru.sin.design_patterns.structure.adapter.round.RoundHole;
import ru.sin.design_patterns.structure.adapter.round.RoundPeg;
import ru.sin.design_patterns.structure.adapter.square.SquarePeg;

public class AdapterApplication {
    public void run() {
        var roundHole = new RoundHole().setRadius(5);
        var roundPeg = new RoundPeg().setRadius(4);

        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r4 fits round hole r5.");
        }

        var smallSquarePeg = new SquarePeg().setWidth(2);
        var bigSquarePeg = new SquarePeg().setWidth(20);

        if (roundHole.fits(new SquarePegAdapter(smallSquarePeg))) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (!roundHole.fits(new SquarePegAdapter(bigSquarePeg))) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
