package designPatterns.adapter.v0;

public class Loan {
    private final int eligibilityAmount = 100000; // Example eligibility amount

    public boolean checkEligibility(YesBankAPI bankAPI) {
        if(bankAPI.getBalance() > eligibilityAmount) {
            System.out.println("Eligible for loan");
            return true;
        } else {
            System.out.println("Not eligible for loan");
        }
        return false;
    }
}
