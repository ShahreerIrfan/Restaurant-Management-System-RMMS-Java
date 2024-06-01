public class PremiumMenuItem extends MenuItem {
    private double surchargePercentage;

    public PremiumMenuItem() {
        super();
        this.surchargePercentage = 0.0;
    }

    public PremiumMenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute, double surchargePercentage) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
        this.surchargePercentage = surchargePercentage;
    }

    @Override
    public void setPrice(double price) {
        this.itemPrice = price + (price * surchargePercentage / 100);
    }

    public double getSurchargePercentage() {
        return surchargePercentage;
    }

    public void setSurchargePercentage(double surchargePercentage) {
        this.surchargePercentage = surchargePercentage;
    }
}
