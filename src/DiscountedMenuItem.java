public class DiscountedMenuItem extends MenuItem {
    private static final double DISCOUNT_PERCENTAGE = 5.0;

    public DiscountedMenuItem() {
        super();
    }

    public DiscountedMenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public void setPrice(double price) {
        this.itemPrice = price - (price * DISCOUNT_PERCENTAGE / 100);
    }
}
