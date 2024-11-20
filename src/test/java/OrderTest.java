import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    public void initTest() {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));

        Order order = new Order(myFlavors, myToppings, false);
        assertNotNull(order);
    }

    @Test
    public void subtotalTest() {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));

        Order order = new Order(myFlavors, myToppings, true);

        double expectedSubtotal = 3.00 + 0.50 + 5.00;
        assertEquals(expectedSubtotal, order.calculateOrderSubtotal());
    }

    @Test
    public void taxTest() {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));

        Order order = new Order(myFlavors, myToppings, true);
        double expectedTax = 0.08 * (3.00 + 0.50 + 5.00);
        assertEquals(expectedTax, order.calculateOrderTax());
    }

    @Test
    public void orderTotalTest() {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));

        Order order = new Order(myFlavors, myToppings, true);

        double expectedTotal = (3.00 + 0.50 + 5.00) + 0.08*(3.00 + 0.50 + 5.00);
        assertEquals(expectedTotal, order.calculateTotalAmount());
    }

    @Test
    public void waffleConeTest() {
        List<IceCreamFlavor> myFlavors = new ArrayList<>();
        myFlavors.add(new ChocolateFudge(1));

        List<IceCreamTopping> myToppings = new ArrayList<>();
        myToppings.add(new ChocolateChips(1));

        Order order1 = new Order(myFlavors, myToppings, true);
        Order order2 = new Order(myFlavors, myToppings, false);

        assertNotEquals(order1.calculateTotalAmount(), order2.calculateTotalAmount());
    }
}
