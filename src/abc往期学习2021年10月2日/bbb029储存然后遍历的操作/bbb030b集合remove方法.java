package abc����ѧϰ2021��10��2��.bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb030b����remove���� {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        System.out.println("��ʼִ��");
        x.add("111");
        x.add("222");
        x.add("3333");
        System.out.println(x);
        System.out.println("------------------------------");
        // [111, 222, 3333]
        x.remove("222");
        // removeɾ��ָ��Ԫ�أ�����ɾ���ɹ�/ʧ��
        // removeһ���������ͣ�һ��ָ��Ҫɾ����Ԫ�أ�һ��ָ��Ҫɾ����Ԫ�ص�λ��
        x.add("222");
        System.out.println(x);
        System.out.println("------------------------------");
        x.remove(1);
        System.out.println(x);
        // ���Ϊ��[111, 222]
    }
}
