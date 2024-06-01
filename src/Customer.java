public class Customer {
    private String name;
    private double discount;
    private String status;

    public Customer() {
        this.name = "defaultName";
        this.discount = 0.0;
        this.status = "defaultStatus";
    }

    public Customer(String name, String status) {
        this.name = name;
        this.status = status;
        calculateDiscount();
    }

    private void calculateDiscount() {
        switch (status.toLowerCase()) {
            case "active":
                this.discount = 10.0;
                break;
            case "vip":
                this.discount = 15.0;
                break;
            default:
                this.discount = 0.0;
                break;
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", Status: " + status + ", Discount: " + discount + "%";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        calculateDiscount();
    }
}
