package bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb030d����get��size���� {
    public static void main(String[] args) {
        System.out.println("------------------------");
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("111");
        x1.add("222");
        x1.add("333");
        String x2 = x1.get(1);
        // ֱ�ӷ���1λ���ϵ�Ԫ��222
        // ����ָ��λ�ò����ڣ��ͻ��������Խ�������
        System.out.println(x2);
        System.out.println(x1.size());
        // ֱ�����Ԫ�ظ���3

    }
}
