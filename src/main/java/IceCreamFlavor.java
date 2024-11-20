public class IceCreamFlavor {
    private String name;
    private double costPerScoop;
    private int scoops;

    public IceCreamFlavor(int scoops) {
        this.scoops = scoops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerScoop() {
        return costPerScoop;
    }

    public void setCostPerScoop(double costPerScoop) {
        this.costPerScoop = costPerScoop;
    }
}
