public class Sprinkles extends IceCreamTopping {
    public Sprinkles(int toppingAmount) {
        super(toppingAmount);
        this.setName("Sprinkles");
        this.setCost(0.30);
        calculateToppingCost();
    }
}
