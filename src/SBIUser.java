import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private static double rateOfIntrest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfIntrest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {

        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+ amount;
        return "App universe ke powerful ansh hai "+ balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Sorry ! master apko jarurat hai powerful banabe ke liye ";
            }
            else{
                 balance = balance-amount;
                 return "Power hi power "+ balance;
            }
        }
        else{
            return " enter right power password ";
        }
    }

    @Override
    public double calculateInterest(int years) {
        System.out.println("extra intrest get ");
        return (balance*rateOfIntrest*years)/100;
    }
}