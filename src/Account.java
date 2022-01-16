public abstract class Account {
    protected int accountNumber;
    protected static int accountCounter = 10001;
    protected float accountBalance = 0;

    Account(){
        accountNumber = accountCounter++;
        accountBalance = 0;
    }

    Account(float initialBalance){
        accountNumber = accountCounter++;
        accountBalance = initialBalance;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void withdrawMoney(float moneyToWithdraw){
        if((accountBalance - moneyToWithdraw) < 0){
            System.out.println("You do not have enough to withdraw that amount!");
            return;
        }else{
            accountBalance -= moneyToWithdraw;
        }
    }

    public void depositMoney(float moneyToDeposit){
        if(moneyToDeposit <= 0){
            System.out.println("You cannot deposit that amount.");
            return;
        }
        accountBalance += moneyToDeposit;
    }
}
