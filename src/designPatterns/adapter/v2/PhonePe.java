package designPatterns.adapter.v2;

public class PhonePe {
    private BankAPIInterface bankAPIInterface;
    private final Loan loan = new Loan();

    public PhonePe(BankAPIInterface bankAPIInterface) {
        this.bankAPIInterface = bankAPIInterface;
    }

    public void checkLoanEligibility(String upiId) {
        if(loan.checkEligibility(bankAPIInterface)) {
            System.out.println("User " + upiId + " is eligible for a loan.");
        } else {
            System.out.println("User " + upiId + " is not eligible for a loan.");
        }
    }

    public void rechargeFastCard(String userUPI, int amount) {
        FastCard fastCard = new FastCard();
        try {
            fastCard.rechargeCard(bankAPIInterface, userUPI, amount);
        } catch (RuntimeException e) {
            System.out.println("Recharge failed for " + userUPI + ": " + e.getMessage());
        }
    }

    public void setBankAPIInterface(BankAPIInterface bankAPIInterface) {
        this.bankAPIInterface = bankAPIInterface;
    }
}
