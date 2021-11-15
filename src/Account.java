abstract class Account {
    protected String accNo;
    protected String name;
    protected double balance;

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/

    public void deposit(double amount){
        this.balance += amount; 
    }

    public abstract void withdraw(double amount); //abstract method

    public void display(){
        System.out.println(ANSI_BLUE + "Account No : " + getAccNo());
        System.out.println("Name : " + getName());
        System.out.println("Balance : " + getBalance() + ANSI_RESET);
    }
}