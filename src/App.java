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
            System.out.println("Current Account");
            
        }else if(option==3){
            //Fixed Deposit Account
            System.out.println("Fixed Deposit Account");
        }

        scanner.close();
    }
}
