package cofectionery;

public class Marmalade extends Candy {
    private double fruitJuicePersent;
    private double pectinPercent;

    public Marmalade() {
        super();
    }

    public Marmalade(String name, int sugarContent, int weight, double fruitJuicePersent, double pectinPercent) {
        super(name, sugarContent, weight);
        this.fruitJuicePersent = fruitJuicePersent;
        this.pectinPercent = pectinPercent;
    }

    public double getFruitJuicePersent() {
        return fruitJuicePersent;
    }

    public void setFruitJuicePersent(int fruitJuicePersent) {
        this.fruitJuicePersent = fruitJuicePersent;
    }

    public double getPectinPercent() {
        return pectinPercent;
    }

    public void setPectinPercent(int pectinPercent) {
        this.pectinPercent = pectinPercent;
    }

    @Override
    public int costPerOne() {
        return (int) (getWeight() * (getFruitJuicePersent() + getPectinPercent()) * SUGARE_PRICE * getSugarContent());
    }

    @Override
    public String toString() {
        return super.toString() + "Juice content=" + fruitJuicePersent*100 + "%, Peсktin content=" + pectinPercent*100 + "%";
    }

}
