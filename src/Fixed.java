public class Fixed extends Account {
    @Override
    public void withdraw(double amount) {
        if (amount<balance) {
            balance -= amount;  
            System.out.println("Success - available balance is : " + getBalance()); 
        }else{
            System.out.println("Error - Low Balance");
        }
    }
}
