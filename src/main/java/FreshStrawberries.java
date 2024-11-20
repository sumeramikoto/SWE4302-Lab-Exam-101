public class FreshStrawberries extends IceCreamTopping {
    public FreshStrawberries(int toppingAmount) {
        super(toppingAmount);
        this.setName("Fresh Strawberries");
        this.setCost(1.00);
        calculateToppingCost();
    }
}
