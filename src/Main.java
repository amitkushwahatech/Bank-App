import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, strong password ,balance to create account ");

        //create user
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIUser sbiUser = new SBIUser(name,password,balance);

        //add amount
        String message = sbiUser.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password ");
        String pass = sc.next();
        System.out.println(sbiUser.withdrawMoney(money,pass));

        // rate of intrest
        System.out.println(sbiUser.calculateInterest(10));

    }
}