package abc����ѧϰ2021��10��2��.bbb039ATM����;

public class bbb001�˻��� {
    private int accountNumber;
    private String accountName;
    private int accountbalance;
    private String accountpassword;
    private int accountcashlimit;

    public bbb001�˻���() {
    }

    public bbb001�˻���(int accountNumber, String accountName, int accountbalance, String accountpassword, int accountcashlimit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountbalance = accountbalance;
        this.accountpassword = accountpassword;
        this.accountcashlimit = accountcashlimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getAccountpassword() {
        return accountpassword;
    }

    public void setAccountpassword(String accountpassword) {
        this.accountpassword = accountpassword;
    }

    public int getAccountcashlimit() {
        return accountcashlimit;
    }

    public void setAccountcashlimit(int accountcashlimit) {
        this.accountcashlimit = accountcashlimit;
    }
}
