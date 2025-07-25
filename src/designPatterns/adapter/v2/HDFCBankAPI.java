package designPatterns.adapter.v2;

import designPatterns.adapter.v2.hdfc.HDFCBankTransferRequest;
import designPatterns.adapter.v2.hdfc.HDFCBankTransferResponse;

public class HDFCBankAPI {
    public HDFCBankTransferResponse transferMoney(HDFCBankTransferRequest request) {
        return new HDFCBankTransferResponse("SUCCESS", "Transfer Successful", 123456);
    }
}
