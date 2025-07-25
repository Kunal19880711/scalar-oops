package designPatterns.adapter.v2.hdfc;

public class HDFCBankTransferResponse {
    private String status;
    private String message;
    private int transactionId;

    public HDFCBankTransferResponse(String status, String message, int transactionId) {
        this.status = status;
        this.message = message;
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public int getTransactionId() {
        return transactionId;
    }
}
