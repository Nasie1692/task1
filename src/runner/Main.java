package runner;

import cofectionery.Candy;
import comparators.NameComparator;
import filters.SugareFilter;
import gift.Gift;
import gift.GiftCreator;

public class Main {

    public static void main(String[] args) {
        Gift gift = GiftCreator.newGift();
        sort(gift);
        System.out.println("----------- CALCUATIONS ----------");
        System.out.println("Summary cost: " + gift.cost());
        System.out.println("Summary weight: " + gift.weight());
        find(gift);
    }

    private static void find(Gift gift) {
        Candy[] candies = new Candy[gift.getCandies().size()];
        int foundCandies = gift.findBySugareContent(candies, new SugareFilter(2, 6));
        System.out.println("---------- SEARCH RESULTS ---------");
        for (int i = 0; i < foundCandies; i++) {
            System.out.println("Name=" + candies[i].getName() + ", Sugare content=" + candies[i].getSugarContent());
        }
    }

    private static void sort(Gift gift) {
        gift.sort(new NameComparator());
        System.out.println("--------- SORTED BY NAME ---------");
        for (Candy candy : gift.getCandies()) {
            System.out.println(candy);
        }
    }

}
