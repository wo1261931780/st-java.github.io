package c2stage_20220113.ccc023abstract_class_Design_Patterns;

public abstract class ccc001bank_abstract {
    private String account;
    private String passwords;
    private double rates;
    private double balances;

    public ccc001bank_abstract(String account, double balances) {
        this.account = account;
        this.balances = balances;
    }
    // ֮�������ʹ��super�ؼ��ֵ����вι���
    // �����Ҫ��ǰ׼����

    public ccc001bank_abstract() {
    }

    public void login(String acc, String paw) {//��Ҫע����ǣ�ģ�巽��Ҫ��final��ֹ����д
        while (true) {
            if (acc.equals(account) && paw.equals(passwords)) {
                System.out.println("login success");
                //ģ�巽���Ĳ�֮ͬ�����ڣ������һ���ڲ��ĳ��󷽷�
                // ��������󷽷�����Ҫ������д��
                // ������ã�ֱ��
                double x = caculate_rates();
                // ������Ϊ������������Ķ���Ҳ���������е���login����
                // �������Ȼ�ʹ�������У���д���ķ���
                System.out.println("��Ϣ�ǣ�" + x);
                return;
            } else {
                System.out.println("please retry");
            }
        }
    }

    public abstract double caculate_rates();

    public void show_rates() {
        System.out.println("���Ϊ��" + getBalances() + "�����ʣ�" + getRates());
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    public double getBalances() {
        return balances;
    }

    public void setBalances(double balances) {
        this.balances = balances;
    }
}
