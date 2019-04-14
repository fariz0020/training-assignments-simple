package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static eu.sig.training.ch03.Nationality.*;

public class FlagFactory {

    private static Map<Nationality, List<Color>> FLAGS = new HashMap<Nationality, List<Color>>() {};

    static {
        FLAGS.put(DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        FLAGS.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        FLAGS.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        FLAGS.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        FLAGS.put(ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        FLAGS.put(IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        FLAGS.put(HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        FLAGS.put(BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        FLAGS.put(RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> colors = FLAGS.get(nationality);
        return colors != null ? colors : Arrays.asList(Color.GRAY);
    }
    // end::getFlag[]

}