package cofectionery;

public abstract class Candy {
    protected final int SUGARE_PRICE = 3;
    private String Name;
    private int sugarContent;
    private int weight;

    public Candy() {
        super();
    }

    public Candy(String name, int sugarContent, int weight) {
        super();
        Name = name;
        this.sugarContent = sugarContent;
        this.weight = weight;
    }

    public abstract int costPerOne();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name=\"" + Name + "\", Sugare contant=" + sugarContent + ", Weight=" + weight + ", " + "Cost="
                + costPerOne() + ", ";
    }

}
