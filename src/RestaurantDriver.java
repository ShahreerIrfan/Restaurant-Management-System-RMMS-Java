import java.util.Scanner;

public class RestaurantDriver {
    public static void main(String[] args) {
        Menu takeAwayMenu = new Menu("1", "Take Away Menu", "Take Away", "Main Street", "All Day");
        Menu dineInMenu = new Menu("2", "Dine In Menu", "Dine In", "Downtown", "All Day");

        takeAwayMenu.addItem(new StandardMenuItem(1, "Cheeseburger", "A delicious cheeseburger with fresh lettuce, tomato, and cheese", 10.50, "Standard"));
        takeAwayMenu.addItem(new PremiumMenuItem(2, "Lobster Roll", "Fresh lobster roll with a touch of lemon and butter", 18.00, "Premium", 20.0));
        takeAwayMenu.addItem(new DiscountedMenuItem(3, "Caesar Salad", "Crisp romaine lettuce with Caesar dressing and croutons", 9.00, "Discounted"));
        takeAwayMenu.addItem(new DrinksMenuItem(4, "Lemonade", "Freshly squeezed lemonade", 4.00, "Drink"));
        takeAwayMenu.addItem(new StandardMenuItem(5, "Veggie Burger", "A healthy veggie burger with lettuce, tomato, and avocado", 9.50, "Standard"));
        takeAwayMenu.addItem(new PremiumMenuItem(6, "Grilled Salmon", "Grilled salmon fillet with a side of vegetables", 14.00, "Premium", 15.0));
        takeAwayMenu.addItem(new DiscountedMenuItem(7, "Fruit Salad", "A mix of fresh seasonal fruits", 6.00, "Discounted"));
        takeAwayMenu.addItem(new DrinksMenuItem(8, "Iced Coffee", "Cold brewed coffee with a splash of milk", 5.00, "Drink"));
        takeAwayMenu.addItem(new StandardMenuItem(9, "Chicken Wrap", "Grilled chicken with lettuce, tomato, and ranch in a wrap", 8.50, "Standard"));
        takeAwayMenu.addItem(new PremiumMenuItem(10, "Beef Steak", "Juicy beef steak with a side of mashed potatoes", 20.00, "Premium", 10.0));

        dineInMenu.addItem(new StandardMenuItem(1, "Grilled Chicken Sandwich", "Grilled chicken breast with lettuce, tomato, and mayo", 12.00, "Standard"));
        dineInMenu.addItem(new PremiumMenuItem(2, "Steak Dinner", "Juicy ribeye steak with a side of mashed potatoes", 30.00, "Premium", 15.0));
        dineInMenu.addItem(new DiscountedMenuItem(3, "Pasta Primavera", "Pasta with fresh seasonal vegetables in a light sauce", 15.00, "Discounted"));
        dineInMenu.addItem(new DrinksMenuItem(4, "Iced Tea", "Chilled iced tea with a hint of lemon", 3.50, "Drink"));
        dineInMenu.addItem(new StandardMenuItem(5, "BLT Sandwich", "Bacon, lettuce, and tomato sandwich with mayo", 11.00, "Standard"));
        dineInMenu.addItem(new PremiumMenuItem(6, "Shrimp Scampi", "Shrimp sautéed in garlic butter with a side of pasta", 25.00, "Premium", 10.0));
        dineInMenu.addItem(new DiscountedMenuItem(7, "Greek Salad", "Salad with feta cheese, olives, cucumber, and tomato", 10.00, "Discounted"));
        dineInMenu.addItem(new DrinksMenuItem(8, "Hot Chocolate", "Warm hot chocolate topped with whipped cream", 4.00, "Drink"));
        dineInMenu.addItem(new StandardMenuItem(9, "Turkey Club Sandwich", "Turkey sandwich with bacon, lettuce, and tomato", 13.00, "Standard"));
        dineInMenu.addItem(new PremiumMenuItem(10, "Lamb Chops", "Grilled lamb chops with rosemary sauce", 32.00, "Premium", 12.0));

        System.out.println("Welcome to the Restaurant Menu Management System (RMMS)");
        System.out.println("Developed by: Team Emon");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to place an order? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("Please enter your status (Active/VIP/New):");
            String status = scanner.nextLine();

            Customer customer = new Customer(name, status);
            System.out.println("Select a menu: 1. Take Away Menu 2. Dine In Menu");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();

            Menu selectedMenu = (menuChoice == 1) ? takeAwayMenu : dineInMenu;
            System.out.println(selectedMenu);

            System.out.println("Enter the item numbers you want to add to your order (comma separated):");
            String[] itemNumbers = scanner.nextLine().split(",");

            double total = 0.0;
            for (String itemNumber : itemNumbers) {
                int num = Integer.parseInt(itemNumber.trim());
                MenuItem item = selectedMenu.getItem(num - 1);
                total += item.getItemPrice();
            }

            total -= total * (customer.getDiscount() / 100);
            if (menuChoice == 2) {
                total += total * 0.025; 
            }

            System.out.println("Total amount due: $" + total);
        } else {
            System.out.println("Thank you for stay with us");
        }

        scanner.close();
    }
}

// ....