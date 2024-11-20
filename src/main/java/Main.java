import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(2));
        myFlavors.add(new PistachioDelight(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));
        myToppings.add(new FreshStrawberries(4));

        Order order = new Order(myFlavors, myToppings, true);

        System.out.println(order.calculateOrderSubtotal());
        System.out.println(order.calculateOrderTax());
        System.out.println(order.calculateTotalAmount());

        Invoice invoice = new Invoice(order);
        invoice.generateInvoice();
    }
}
