package c2stage_20220302.ddd086�Ƚ�������;

import java.util.Comparator;
import java.util.TreeSet;

public class ddd087�Ƚ��� {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        TreeSet<ddd088������> x = new TreeSet<>(new Comparator<ddd088������>() {
            @Override
            public int compare(ddd088������ o1, ddd088������ o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                // ���ʽ�����ϸ�����
                return num2;
            }
            // ����ʹ�������ڲ��࣬�൱���½���һ���Ƚ�����������д�˱Ƚ�������
            // �ڲ����ڷ����ڲ�������thisָ�����ǱȽ���
            // o1��ʾ����this.xx,o2��ʾs.xx
            // ����һ�£�
            // ����һ���࣬����һ��������ͬʱ�̳���һ������
            // ���ж����age����Ҫʹ��this.age����
            // �����ж����age����ֱ�ӷ���
            // �����е�age��Ҫʹ��super.age����
            // ��Ҫע���һ�����ڣ�
            // ��Ȼ�������ڶ���������д������������ֱ���ڹ���treeset��ʱ�������д����
        });
        ddd088������ x1 = new ddd088������("a1", 11);
        ddd088������ x2 = new ddd088������("a2", 22);
        ddd088������ x3 = new ddd088������("a3", 33);
        ddd088������ x4 = new ddd088������("a1", 11);
        ddd088������ x5 = new ddd088������("f1", 33);
        x.add(x4);
        x.add(x3);
        x.add(x2);
        x.add(x1);
        x.add(x5);
        for (ddd088������ i : x) {
            System.out.println(i.getName() + "--" + i.getAge());
        }

    }
}
