public class MintChocolateChip extends  IceCreamFlavor{
    public MintChocolateChip(int scoops) {
        super(scoops);
        this.setName("Mint Chocolate Chip");
        this.setCostPerScoop(2.80);
        this.calculateFlavorCost();
    }
}
