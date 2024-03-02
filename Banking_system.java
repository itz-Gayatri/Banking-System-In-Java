import java.util.Scanner;
class ATM
 {
 int balance;
public ATM(int initialBalance)
 {
 balance = initialBalance;
 }
public void withdraw(int amount)
 {
 if (balance >= amount)
 {
 balance -= amount;
 System.out.println("Please collect your money.");
 }
 Else
 {
 System.out.println("Not enough balance available.");
 }
 }
public void deposit(int amount)
 {
 balance += amount;
 System.out.println("Your deposit is successful.");
 }
 public int checkBalance()
 {
 return balance;
 }
}
class ATMTransaction extends ATM
{
 public ATMTransaction(int initialBalance)
 {
 super(initialBalance);
 }
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Welcome to TJSB bank ATM");
 ATMTransaction A = new ATMTransaction(3000);
 while (true) {
 System.out.println("Enter your choice:");
 System.out.println("1: Withdraw");
 System.out.println("2: Deposit");
 System.out.println("3: Balance");
 System.out.println("4: Exit");
 int choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.println("Enter the amount to withdraw:");
 int amountToWithdraw = sc.nextInt();
 A.withdraw(amountToWithdraw);
 break;
 case 2:
 System.out.println("Enter the amount to deposit:");
 int amountToDeposit = sc.nextInt();
 A.deposit(amountToDeposit);
 break;
 case 3:
 int balance = A.checkBalance();
 System.out.println("Balance: " + balance);
 break;
 case 4:
 System.out.println("Thank you for using TJSB bank ATM.");
 System.exit(0);
 default:
 System.out.println("Invalid choice. Please try again.");
 break;
 }
 System.out.println("");
 }
 }
}