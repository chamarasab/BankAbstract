public class Current extends Account{
    
    public Current(String a, String n, double b) {
        this.accNo = a;
        this.name = n;
        this.balance = b;
        System.out.println("New Current Account Created Successfully");
    }

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
