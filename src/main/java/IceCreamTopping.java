public class IceCreamTopping {
    private String name;
    private double cost;
    private int toppingAmount;
    private double toppingTotalCost;

    public IceCreamTopping(int toppingAmount) {
        this.toppingAmount = toppingAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void calculateToppingCost() {
        this.toppingTotalCost = toppingAmount * cost;
    }

    public double getToppingCost() {
        return toppingTotalCost;
    }
}
