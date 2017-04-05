package comparators;

import java.util.Comparator;
import cofectionery.Candy;

public class WeightComparator implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
