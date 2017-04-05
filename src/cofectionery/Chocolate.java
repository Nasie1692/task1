package cofectionery;

public class Chocolate extends Candy {
    private final int COCOA_PRICE = 50;
    private double cocoaPecent;

    public Chocolate() {
        super();
    }

    public Chocolate(String name, int sugarContent, int weight, double cocoaPecent) {
        super(name, sugarContent, weight);
        this.cocoaPecent = cocoaPecent;
    }

    public double getCocoaPecent() {
        return cocoaPecent;
    }

    public void setCocoaPecent(double cocoaPecent) {
        this.cocoaPecent = cocoaPecent;
    }

    @Override
    public int costPerOne() {
        return (int) (getWeight()*(COCOA_PRICE*cocoaPecent+SUGARE_PRICE*getSugarContent()));
    }

    @Override
    public String toString() {
        return super.toString() + "Cocoa=" + cocoaPecent*100 + "%";
    }

}
