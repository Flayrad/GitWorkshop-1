import java.util.ArrayList;

class Order {
    public int price = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + price);
        System.out.println("Here are your items: " + items);
    }
}
