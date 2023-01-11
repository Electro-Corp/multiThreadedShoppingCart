import java.util.Scanner;

public class Simulate extends Thread {
    public static void main(String[] args){
        boolean done = false;
        ShoppingCart s = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        while(!done){
            
            System.out.println("Enter name of product or enter 'quit' to quit.");
            String name = sc.nextLine();
            if(name.equals("quit"))break;
            System.out.println("Enter price of object:");
            double val = sc.nextDouble();
            System.out.println("Quantity: ");
            int q = sc.nextInt();
            s.addToCart(name, val, q);
            System.out.println("Press enter to continue");
            sc.nextLine();
        }
        System.out.println("Shopping done, can cry about it: ");
        System.out.println(s.toString());
    }
}
