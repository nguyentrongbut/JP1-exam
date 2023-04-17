public class Account {
    private String customerCode;
    private int accNumber;
    private long amount;
    public Account(String customerCode, int accNumber) {
        this.customerCode = customerCode;
        this.accNumber = accNumber;
        this.amount = 0;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public long getAmount() {
        return amount;
    }

}
