package designPatterns.adapter.v2.hdfc;

public class HDFCBankTransferRequest {
    private String fromUPI;
    private String toUPI;
    private int amount;

    public HDFCBankTransferRequest(String fromUPI, String toUPI, int amount) {
        this.fromUPI = fromUPI;
        this.toUPI = toUPI;
        this.amount = amount;
    }

    public String getFromUPI() {
        return fromUPI;
    }

    public String getToUPI() {
        return toUPI;
    }

    public int getAmount() {
        return amount;
    }
}
