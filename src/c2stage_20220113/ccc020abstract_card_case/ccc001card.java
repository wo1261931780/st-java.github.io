package c2stage_20220113.ccc020abstract_card_case;

public abstract class ccc001card {
    private String name;
    // private int balance;//������λС�����Ժ�Ҫע��
    private double balance;//������λС�����Ժ�Ҫע��

    // public abstract void card();

    public abstract void pay(double prices) ;
    // {
        // System.out.println("pay something" + prices);
        // System.out.println("balance" + (this.balance-prices));
    // }
    // ���󷽷�û�з�����


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
