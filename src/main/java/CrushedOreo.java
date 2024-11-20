public class CrushedOreo extends IceCreamTopping {
    public CrushedOreo(int toppingAmount) {
        super(toppingAmount);
        this.setName("Crushed Oreo");
        this.setCost(0.85);
        calculateToppingCost();
    }
}
