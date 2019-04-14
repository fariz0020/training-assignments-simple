package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     *
     * @param g
     *            The graphics context to draw on.
     * @param position
     *            The position of drawing.
     */
    private void render(Graphics g, Map<String, Integer> position) {
        Square square = new Square();
        square.getSprite().draw(g, position);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, position);
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Map<String, Integer> position) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
