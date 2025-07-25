package designPatterns.adapter.v2;

public class ICICIBankAPI {
    private String toUPI;

    public int fetchBalance() {
        return 0;
    }

    void verifyAndAddDestinationUPI(String toUPI) {
        // validate toUPI

    }

    public void makeTransfer(String fromUPI, int amount) {
        if(fetchBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }


    }
}
