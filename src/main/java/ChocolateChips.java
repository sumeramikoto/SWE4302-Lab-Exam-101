public class ChocolateChips extends IceCreamTopping {
    public ChocolateChips(int toppingAmount) {
        super(toppingAmount);
        this.setName("Chocolate Chips");
        this.setCost(0.50);
        calculateToppingCost();
    }
}
