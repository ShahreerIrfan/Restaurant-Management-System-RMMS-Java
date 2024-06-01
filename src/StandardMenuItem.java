public class StandardMenuItem extends MenuItem {
    public StandardMenuItem() {
        super();
    }

    public StandardMenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public void setPrice(double price) {
        this.itemPrice = price;
    }
}
// ...............