public class Savings extends Account{
    private int numberOfDeposits = 0;
    private static final float interestAmount = 1.015f;

    Savings(){
        accountBalance = 0;
    }

    Savings(float initialBalance){
        accountBalance = initialBalance;
    }

    @Override
    public void withdrawMoney(float amountToWithdraw){
        accountBalance -= amountToWithdraw;
        if(accountBalance < 500){
            System.out.println("Charging a fee of $10 because you are below $500");
            accountBalance -= 10.0f;
        }
    }

    @Override
    public void depositMoney(float amountToDeposit){
        if(amountToDeposit <= 0){
            System.out.println("You can't deposit that amount.");
            return;
        }
        accountBalance += amountToDeposit;
        numberOfDeposits++;
        System.out.println("This is deposit number "+numberOfDeposits+" to this account.");
        if(numberOfDeposits >= 6){
            System.out.println("Charging a fee of $10");
            accountBalance -= 10.0f;
        }
    }

    public void addInterest(){
        float originalBalance = accountBalance;
        accountBalance *= interestAmount;
        System.out.println("Customer earned "+(accountBalance - originalBalance)+" in interest.");
    }
}
