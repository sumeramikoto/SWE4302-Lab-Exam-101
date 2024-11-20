public class StrawberrySwirl extends IceCreamFlavor {
    public StrawberrySwirl(int scoops) {
        super(scoops);
        this.setName("Strawberry Swirl");
        this.setCostPerScoop(2.75);
        this.calculateFlavorCost();
    }
}
