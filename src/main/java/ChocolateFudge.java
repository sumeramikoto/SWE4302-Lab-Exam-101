public class ChocolateFudge extends IceCreamFlavor {
    public ChocolateFudge(int scoops) {
        super(scoops);
        this.setName("Chocolate Fudge");
        this.setCostPerScoop(3.00);
        this.calculateFlavorCost();
    }
}
