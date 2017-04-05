package gift;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import filters.Filter;
import cofectionery.Candy;

public class Gift {
    private List<Candy> candies;

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    public int cost() {
        int giftCost = 0;
        for (Candy candy : candies) {
            giftCost += candy.costPerOne();
        }
        return giftCost;
    }

    public int weight() {
        int giftWeight = 0;
        for (Candy candy : candies) {
            giftWeight += candy.getWeight();
        }
        return giftWeight;
    }

    public void sort(Comparator<Candy> comparator) {
        Collections.sort(getCandies(), comparator);
    }

    public int findBySugareContent(Candy[] candies, Filter filter) {
        int position = 0;
        for (Candy candy : getCandies()) {
            if (filter.isSatisfy(candy)) {
                candies[position] = candy;
                position++;
            }
        }
        return position;
    }
}
