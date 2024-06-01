public abstract class MenuItem {
    protected int itemNumber;
    protected String itemName;
    protected String description;
    protected double itemPrice;
    protected String additionalAttribute;

    public MenuItem() {
        this.itemNumber = 0;
        this.itemName = "defaultItem";
        this.description = "defaultDescription";
        this.itemPrice = 0.0;
        this.additionalAttribute = "defaultAttribute";
    }

    public MenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;
        this.additionalAttribute = additionalAttribute;
    }

    public abstract void setPrice(double price);

    @Override
    public String toString() {
        return "Item Number: " + itemNumber + ", Name: " + itemName + ", Description: " + description +
                ", Price: $" + itemPrice + ", Additional Info: " + additionalAttribute;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getAdditionalAttribute() {
        return additionalAttribute;
    }

    public void setAdditionalAttribute(String additionalAttribute) {
        this.additionalAttribute = additionalAttribute;
    }
}
