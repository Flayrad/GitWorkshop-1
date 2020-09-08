import java.util.ArrayList;

class Order {
    public int price = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + price);
        System.out.println("Here are your items: " + items);
    }

    public void addChickenSandwich() {
        price = price + 5;
        items.add("Chicken sandwich");
        System.out.println("You added a chicken sandwich to your order");
    }
    
    public void addDrink() {
        price = price + 1;
        items.add("drink");
        System.out.println("You added a drink to your order");
    }

    public void addFries() {
        price = price + 1;
        items.add("fries");
        System.out.println("You added fries to your order");
    }

    public void addShake() {
        price = price + 2;
        items.add("shake");
        System.out.println("You added a shake to your order");
    }

    public void addSalad() {
        price = price + 4;
        items.add("salad");
        System.out.println("You added a salad to your order");
    }
}
