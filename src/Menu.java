import java.util.ArrayList;

public class Menu {
    private String menuID;
    private String name;
    private String purpose;
    private String venue;
    private String sessionTime;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuID = "defaultID";
        this.name = "defaultName";
        this.purpose = "defaultPurpose";
        this.venue = "defaultVenue";
        this.sessionTime = "defaultSessionTime";
        this.menuItems = new ArrayList<>();
    }

    public Menu(String menuID, String name, String purpose, String venue, String sessionTime) {
        this.menuID = menuID;
        this.name = name;
        this.purpose = purpose;
        this.venue = venue;
        this.sessionTime = sessionTime;
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
    }

    public MenuItem getItem(int index) {
        return menuItems.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu ID: ").append(menuID).append("\n")
                .append("Name: ").append(name).append("\n")
                .append("Purpose: ").append(purpose).append("\n")
                .append("Venue: ").append(venue).append("\n")
                .append("Session Time: ").append(sessionTime).append("\n")
                .append("Menu Items:\n");
        for (MenuItem item : menuItems) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
