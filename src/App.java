import java.util.Scanner;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) throws Exception {
        System.out.println(ANSI_YELLOW + "Welcome to Bank" + ANSI_RESET);

        System.out.println(ANSI_GREEN + "Press 1 to Saving Account\nPress 2 to Current Account\nPress 3 to Fixed Deposit Account" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        byte option = scanner.nextByte();           //get user input
        if (option==1) {
            //Saving Account
            System.out.println("Saving Account");
            String a,n;
            Double b;
            System.out.println(ANSI_CYAN + "Enter Account No: " + ANSI_RESET);
            a = scanner.next();
            System.out.println(ANSI_CYAN + "Enter Name : " + ANSI_RESET);
            n = scanner.next();
            System.out.println(ANSI_CYAN + "Enter initial deposit amount : " + ANSI_RESET);
            b = scanner.nextDouble();

            Account saving = new Saving(a, n, b);

            saving.display();

            System.out.println(ANSI_RED + "Enter Withdrawal Amount : " + ANSI_RESET);
            double withdraw;
            withdraw = scanner.nextDouble();

            saving.withdraw(withdraw);

            saving.display();

            System.out.println(ANSI_GREEN + "Enter Deposit Amount : " + ANSI_RESET);
            double deposit;
            deposit = scanner.nextDouble();
            saving.deposit(deposit);

            saving.display();
        }else if (option==2) {
            //Current Account
            System.out.println(ANSI_RED + "Current Account" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Minimum deposit required to open a Sampath Current Account: 15000/=" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Enter account no : " + ANSI_RESET);
            String a = scanner.next();                  //user input acc no.
            System.out.println(ANSI_YELLOW + "Enter Name : " + ANSI_RESET);
            String n = scanner.next();                  //user input acc holder's name
            System.out.println(ANSI_YELLOW + "Enter amount : " + ANSI_RESET);
            double b = scanner.nextDouble();
            if (b>=15000) {
                Account current = new Current(a, n, b);          //account created  
                
                System.out.println(ANSI_RED + "Enter amount to withdraw : " + ANSI_RESET);  //withdraw
                double withdraw = scanner.nextDouble();
                current.withdraw(withdraw);
                current.display();

                System.out.println(ANSI_RED + "\n Enter amount to deposit : " + ANSI_RESET);    //deposit 
                double deposit = scanner.nextDouble();
                current.deposit(deposit);
                current.display();
            }else{
                System.out.println("Error - Enter amount greater than 15000/=");
            }
            
        }else if(option==3){
            //Fixed Deposit Account
            System.out.println("Fixed Deposit Account");
            System.out.println("Enter account no : ");
            String a = scanner.next();                  //user input acc no.
            System.out.println("Enter Name : ");
            String n = scanner.next();                  //user input acc holder's name
            System.out.println("Minimum deposit is 25000/=  Interest rate is 5.5% \nEnter amount : ");
            double b = scanner.nextDouble();            //user input deposit amount
            if (b>25000) {
                Account fixed = new Fixed(a, n, b);     //creating account
                fixed.setDepositPeriodInMonths(12.0);
                fixed.getInterest();                    //display calculated interest amounts
            }else{System.out.println("Enter amount above 25000/=");}
                                   
        }

        scanner.close();
    }
}
