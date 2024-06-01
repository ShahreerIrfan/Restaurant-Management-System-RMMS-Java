public class DrinksMenuItem extends MenuItem {
    public DrinksMenuItem() {
        super();
    }

    public DrinksMenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public void setPrice(double price) {
        this.itemPrice = price;
    }
}
