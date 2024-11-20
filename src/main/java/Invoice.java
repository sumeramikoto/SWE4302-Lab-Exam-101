import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Invoice {
    Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    public void generateInvoice() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("invoice.txt"))) {
            writer.write("Ice Cream Shop Invoice\n");
            List<IceCreamFlavor> flavorList = order.getFlavorList();
            List<IceCreamTopping> toppingList = order.getToppingList();
            for (IceCreamFlavor flavor : flavorList) {
                String toWrite = flavor.getName() + " - " +
                        "Scoops - " + flavor.getScoops() +
                        ": " + flavor.getFlavorCost();
                writer.write(toWrite + "\n");
            }

            for (IceCreamTopping topping : toppingList) {
                String toWrite = topping.getName() + " - " +
                        "Amount - " + topping.getToppingAmount() +
                        ": " + topping.getToppingCost();
                writer.write(toWrite + "\n");
            }

            writer.write("Subtotal: $" + order.calculateOrderSubtotal() + "\n");
            writer.write("Tax: $" + order.calculateOrderTax() + "\n");
            writer.write("Total Amount Due: $" + order.calculateTotalAmount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
