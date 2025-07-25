package designPatterns.adapter.v1;

public class Loan {
    private final int eligibilityAmount = 100000; // Example eligibility amount

    public boolean checkEligibility(BankAPIInterface bankAPIInterface) {
        if(bankAPIInterface.getBalanceInfo() > eligibilityAmount) {
            System.out.println("Eligible for loan");
            return true;
        } else {
            System.out.println("Not eligible for loan");
        }
        return false;
    }
}
