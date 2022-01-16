import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Checking checking = new Checking();
        Savings savings = new Savings();

        boolean running = true;
        do{
            displayMenu();
            switch (getValidateReturnInt()){
                case 1://Withdraw from checking
                    System.out.println("How much money do you want to withdraw from checking?");
                    checking.withdrawMoney(getValidateReturnFloat());
                    break;
                case 2://Withdraw from savings
                    System.out.println("How much money do you want to withdraw from savings?");
                    savings.withdrawMoney(getValidateReturnFloat());
                    break;
                case 3://Deposit money to checking
                    System.out.println("How much do you want to deposit into checking?");
                    checking.depositMoney(getValidateReturnFloat());
                    break;
                case 4://Deposit money to savings.
                    System.out.println("How much do you want to deposit into savings?");
                    savings.depositMoney(getValidateReturnFloat());
                    break;
                case 5://Balance of checking
                    System.out.println("Your balance for checking "+checking.getAccountNumber()+" is "+checking.getAccountBalance());
                    break;
                case 6://Balance of savings
                    System.out.println("Your balance for savings "+savings.getAccountNumber()+" is "+savings.getAccountBalance());
                    break;
                case 7://Award interest to Savings
                    savings.addInterest();
                    break;
                case 8://Quit.
                    running = false;
                    break;
            }
        }while(running);
    }
    public static void displayMenu(){
        System.out.println("1. Withdraw from Checking");
        System.out.println("2. Withdraw from Savings");
        System.out.println("3. Deposit to Checking");
        System.out.println("4. Deposit to Saving");
        System.out.println("5. Balance of Checking");
        System.out.println("6. Balance of Saving");
        System.out.println("7. Award interest to Savings now");
        System.out.println("8. Quit");
    }

    public static int getValidateReturnInt(){
        Scanner sc = new Scanner(System.in);
        boolean checkPassed = false;
        while(!checkPassed) {
            try {
                int userInput = sc.nextInt();
                if(userInput >= 1 && userInput <= 8){
                    return userInput;
                }else{
                    System.out.println("Please enter a value between 1 - 8.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer.");
            } catch (Exception e) {
                System.out.println("Please enter a valid input.");
            }
        }
        return -1; //This line should never execute.
    }
    public static float getValidateReturnFloat(){
        Scanner sc = new Scanner(System.in);
        boolean checkPassed = false;
        while(!checkPassed) {
            try {
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a float.");
            } catch (Exception e) {
                System.out.println("Please enter a valid input.");
            }
        }

        return -1.0f;// This line should never execute.
    }
}
