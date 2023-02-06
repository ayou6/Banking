package Banker;

public class Account {
	private int accountNo;
	public String accountName;
	private double balance;
	
	
    
    // getters and setters
    public int getAccountNumber() {
        return this.accountNo;
    }
    
    public void setAccountNumber(int accountNo) {
        this.accountNo = accountNo;
    }
    
    public String getAccountHolderName() {
        return this.accountName;
    }
    
    public void setAccountHolderName(String accountName) {
        this.accountName = accountName;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
    	
    	
        try {
            if (amount > balance) {
                throw new Exception("No Enough Amount to Withdraw");
            } else if(amount > 100 ) {
            	System.out.println("The Amount Exceddedthe limit");
            } 
            else {
         
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void diposit(double amount) {
    	System.out.println("Enter Amount:");
    	double balance = Main.scn.nextDouble();
        setBalance(balance);
        double total = amount + balance;
        System.out.println("Your current balance is:"+ total + "OMR");
        
        
        
    }
    

    
	

}
