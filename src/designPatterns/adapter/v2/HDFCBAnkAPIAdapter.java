package designPatterns.adapter.v2;

import designPatterns.adapter.v2.hdfc.HDFCBankTransferRequest;
import designPatterns.adapter.v2.hdfc.HDFCBankTransferResponse;

public class HDFCBAnkAPIAdapter implements BankAPIInterface{
    private final HDFCBankAPI hdfcBankAPI = new HDFCBankAPI();

    @Override
    public int getBalanceInfo() {
        throw new UnsupportedOperationException("HDFC Bank API does not support balance retrieval.");
    }

    @Override
    public void sendMoney(int amount, String fromUPI, String toUPI) {
        HDFCBankTransferResponse response = hdfcBankAPI.transferMoney(new HDFCBankTransferRequest(fromUPI, toUPI, amount));
        if (response.getStatus().equals("SUCCESS")) {
            System.out.println("Money transferred successfully from " + fromUPI + " to " + toUPI);
        } else {
            System.out.println("Failed to transfer money: " + response.getMessage());
        }
    }
}
