package c2stage_20220113.ccc020abstract_card_case;

public class ccc003card_silver extends ccc001card {
    @Override
    public void pay(double prices) {
        System.out.println(getName() + "����������ǰ���" + getBalance() + "����" + prices*0.85 + "ʣ�ࣺ" + (getBalance() - prices*0.85));
    }
}
