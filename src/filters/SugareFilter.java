package filters;

import cofectionery.Candy;

public class SugareFilter implements Filter {
    int min;
    int max;

    public SugareFilter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSatisfy(Candy candy) {
        return ((candy.getSugarContent() >= min) && (candy.getSugarContent() <= max));
    }
}
