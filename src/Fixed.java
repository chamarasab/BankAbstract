public class Fixed extends Account {
    //interest counts monthly 
    private static double interest=5.5;
    private byte depositPeriodInMonths=12;

    public Fixed(String a, String n, double b) {
        this.accNo = a;
        this.name = n;
        this.balance = b;
        System.out.println("New Fixed Account Created Successfully");
    }

    public byte getDepositPeriodInMonths() {
        return depositPeriodInMonths;
    }

    public void setDepositPeriodInMonths(byte depositPeriodInMonths) {
        this.depositPeriodInMonths = depositPeriodInMonths;
    }

    public void getInterest(){
        double interestvalue = getBalance()*(interest/100);
        System.out.println("Interest for 12 months : " + interestvalue);
        double fixedValue = this.balance+interestvalue;
        System.out.println("Total You can withdrw at end of the 12 month is " + fixedValue);
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
