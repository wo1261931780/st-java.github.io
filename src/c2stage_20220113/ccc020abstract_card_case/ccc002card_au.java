package c2stage_20220113.ccc020abstract_card_case;

import java.util.Scanner;

public class ccc002card_au extends ccc001card {

    @Override
    public void pay(double prices) {
        System.out.println(getName()+"���˻�Ϊ�𿨣����"+getBalance()+"������"+prices*0.8+"����ǰʣ��"+(getBalance()-prices*0.8));
    }

    // public static void main(String[] args) {
    //     ccc002card_au x = new ccc002card_au();
    //     Scanner x1 = new Scanner(System.in);
    //     x.setName(x1.nextLine());
    //     System.out.println("--------------");
    //     Scanner x2 = new Scanner(System.in);
    //     x.setBalance(x2.nextInt());
    //     // x.card();
    //     // x.card_info();
    //     x.pay(100);
    // }

}
