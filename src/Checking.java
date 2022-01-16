public class Checking extends Account{

    Checking(){
        accountBalance = 0;
    }

    Checking(float initialBalance){
        accountBalance = initialBalance;
    }

    @Override
    public void withdrawMoney(float moneyToWithdraw) {
        accountBalance -= moneyToWithdraw;
        if(accountBalance < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            accountBalance -= 20.0f;
        }
    }
}
