public class IceCreamFlavor {
    private String name;
    private double costPerScoop;

    public IceCreamFlavor(String name, double cost) {
        this.name = name;
        this.costPerScoop = cost;
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
