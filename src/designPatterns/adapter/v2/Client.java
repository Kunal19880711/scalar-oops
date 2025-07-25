package designPatterns.adapter.v2;

public class Client {
    public static void main(String[] args) {
        String bank = "YesBank";

        BankAPIInterface bankAPI = GetBankAPI.getBankAdapter(bank);
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.checkLoanEligibility("user0101@yesbank");
        phonePe.rechargeFastCard("user0101@yesbank", 500);

        // Switching to a different bank
        bank = "HDFC";
        bankAPI = GetBankAPI.getBankAdapter(bank);
        phonePe.setBankAPIInterface(bankAPI);

        phonePe.checkLoanEligibility("user0101@hdfc");
        phonePe.rechargeFastCard("user0101@hdfc", 1000);
    }
}
