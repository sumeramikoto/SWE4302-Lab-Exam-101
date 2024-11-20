public class PistachioDelight extends IceCreamFlavor {
    public PistachioDelight(int scoops) {
        super(scoops);
        this.setName("Pistachio Delight");
        this.setCostPerScoop(3.25);
        this.calculateFlavorCost();
    }
}
