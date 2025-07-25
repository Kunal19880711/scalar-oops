package designPatterns.adapter.v2;

public class GetBankAPI {
    public static BankAPIInterface getBankAdapter(String bankName) {
        switch (bankName.toLowerCase()) {
            case "hdfc":
                return new HDFCBAnkAPIAdapter();
            case "yesbank":
                return new YesBankAPIAdapter();
//            case "icici":
//                return new ICICIBankAPIAdapter();
            default:
                throw new IllegalArgumentException("Unsupported bank: " + bankName);
        }
    }
}
