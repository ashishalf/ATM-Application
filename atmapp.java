import java.util.*;
public class atmapp
{
	public static void main(String[] args) {
	    int balance = 10000, withdraw, deposit;
	    Scanner sc = new Scanner(System.in);
	    while(true){
		System.out.println("******ATM******");
		System.out.println("Choose The Operation:");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.print("Operation: ");
		int choice = sc.nextInt();
		switch(choice){
		    case 1:
		        System.out.print("Enter Money To Be Withdraw: ");
		        withdraw = sc.nextInt();
		        if(balance >= withdraw){
		            balance=balance-withdraw;
		            System.out.println("Collect Your Money");
		            System.out.println("Your Balance: "+balance);
		        }
		        else{
		            System.out.println("Insufficient Balance");
		            System.out.println("Your Balance: "+balance);
		        }
		        System.out.println("");
		        break;
		        
		    case 2:
		        System.out.print("Enter Money To Be Deposit: ");
		        deposit = sc.nextInt();
		        balance = balance + deposit;
		        System.out.println("Your Money Has Been Successfully Deposited");
		        System.out.println("Your Balance: "+balance);
		        System.out.println("");
		        break;
		        
		    case 3:
		        System.out.println("Your Balance: "+balance);
		        System.out.println("");
		        break;
		    
		    case 4:
		        System.exit(0);
		  }
	   }
	}
}
