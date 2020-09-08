import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("*** Welcome to Chick-Fil-A ***");
        int option = 1;
        Order order = new Order();
        while (option != 0) {
            System.out.println("");
            System.out.println("1. Chicken sandwich");
            System.out.println("2. Drink");
            System.out.println("3. Fries");
            System.out.println("4. Salad");
            System.out.println("5. Shake");
            System.out.println("0. Done");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
            //put your case below this comment
                case 1:
                    order.addChickenSandwich();
                    break;
                case 2:
                    order.addDrink();
                    break;
                case 3: 
                    order.addFries();
                    break; 
                case 4:
                    order.addSalad();
                    break;
                case 5:
                    order.addShake();
                    break;
                case 0:
                    order.printOrder();
                    break;
            }
        }
    }
}
