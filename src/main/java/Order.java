import java.util.List;

public class Order {
    private List<IceCreamFlavor> flavorList;
    private List<IceCreamTopping> toppingList;
    private boolean hasWaffleCone;

    public Order(List<IceCreamFlavor> flavorList, List<IceCreamTopping> toppingList, boolean hasWaffleCone) {
        this.flavorList = flavorList;
        this.toppingList = toppingList;
        this.hasWaffleCone = hasWaffleCone;
    }

    public double calculateFlavorCost() {
        double totalFlavorCost = 0;
        for (IceCreamFlavor flavor: flavorList) {
            totalFlavorCost = totalFlavorCost + flavor.getFlavorCost();
        }
        return totalFlavorCost;
    }

    public double calculateToppingCost() {
        double totalToppingCost = 0;
        for (IceCreamTopping topping: toppingList) {
            totalToppingCost = totalToppingCost + topping.getToppingCost();
        }
        return totalToppingCost;
    }

    public double calculateOrderSubtotal() {
        double totalFlavorCost = calculateFlavorCost();
        double totalToppingCost = calculateToppingCost();
        if (hasWaffleCone) {
            double waffleConePrice = 5.00;
            return totalFlavorCost + totalToppingCost + waffleConePrice;
        } else {
            return totalFlavorCost + totalToppingCost;
        }
    }

    public double calculateOrderTax() {
        double taxPercentage = 0.08;
        double orderSubtotal = calculateOrderSubtotal();
        return taxPercentage * orderSubtotal;
    }

    public double calculateTotalAmount() {
        double orderSubtotal = calculateOrderSubtotal();
        double orderTax = calculateOrderTax();
        return orderSubtotal + orderTax;
    }

    public List<IceCreamFlavor> getFlavorList() {
        return flavorList;
    }

    public void setFlavorList(List<IceCreamFlavor> flavorList) {
        this.flavorList = flavorList;
    }

    public List<IceCreamTopping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<IceCreamTopping> toppingList) {
        this.toppingList = toppingList;
    }
}
