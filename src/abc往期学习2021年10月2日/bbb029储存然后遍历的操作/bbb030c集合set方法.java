package abc����ѧϰ2021��10��2��.bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb030c����set���� {
    public static void main(String[] args) {
        System.out.println("---------------");
        ArrayList<String> x = new ArrayList<>();
        x.add("1111");
        x.add("2222");
        x.add("3333");
        System.out.println(x);
        x.set(0, "000");
        System.out.println(x);
        // ԭʽΪ[1111, 2222, 3333]���޸ĺ���Ϊ[000, 2222, 3333]
        // ��ָ��λ�õ�Ԫ���޸�Ϊָ������
        // �����һ������ȥ����x.set(0, "000")��
        // �õ��Ľ��Ϊ���޸ĵ�Ԫ��1111
        // String x1 = x.set(0, "000");
        // System.out.println(x1);

    }
}
