package gift;

import java.util.ArrayList;
import java.util.List;
import cofectionery.Candy;
import cofectionery.Caramel;
import cofectionery.Chocolate;
import cofectionery.Marmalade;

public class GiftCreator {

    public static Gift newGift() {
        Gift gift = new Gift();
        List<Candy> candies = new ArrayList<>();
        candies.add(new Chocolate("Аленка", 8, 100, 0.4));
        candies.add(new Chocolate("Мишки в лесу", 8, 100, 0.4));
        candies.add(new Chocolate("Alpengold", 10, 120, 0.52));
        candies.add(new Chocolate("Snikers", 7, 70, 0.2));
        candies.add(new Caramel("LolliPops", 5, 30, false));
        candies.add(new Caramel("Мятная", 3, 25, false));
        candies.add(new Caramel("Сливочная", 4, 20, true));
        candies.add(new Caramel("Драже", 2, 18, true));
        candies.add(new Marmalade("Jelly Belly", 6, 10, 0.3, 0.15));
        candies.add(new Marmalade("Trolli", 5, 10, 0, 0.1));
        candies.add(new Marmalade("Concorp", 9, 8, 0.1, 0.2));

        gift.setCandies(candies);

        return gift;
    }

}
