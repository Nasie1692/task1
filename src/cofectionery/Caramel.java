package cofectionery;

public class Caramel extends Candy {
    private boolean filling;

    public Caramel() {
        super();
    }
    
    public Caramel(String name, int sugarContent, int weight, boolean filling) {
        super(name, sugarContent, weight);
        this.filling = filling;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    @Override
    public int costPerOne() {
        if (filling) {
            return (int) (getWeight() * SUGARE_PRICE * getSugarContent() * 1.2);
        } else {
            return (int) (getWeight() * SUGARE_PRICE * getSugarContent() * 0.9);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Filling=" + filling;
    }




}
