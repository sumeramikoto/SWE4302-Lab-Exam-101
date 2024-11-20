public class Marshmallow extends IceCreamTopping {
    public Marshmallow(int toppingAmount) {
        super(toppingAmount);
        this.setName("Marshmallow");
        this.setCost(0.70);
        calculateToppingCost();
    }
}
