package c2stage_20220302.ddd083��Ȼ����;

import java.util.TreeSet;

public class ddd84comparable {
    public static void main(String[] args) {
        TreeSet<ddd85������> x = new TreeSet<>();
        // ������޲ι��췽������ʹ����Ȼ�����Ԫ�ؽ��д���
        // ���ǣ�Ϊ�˰�����������Ҫ��Ҫ��
        // ��Ҫ��compare����������д

        ddd85������ x1 = new ddd85������("a1", 11);
        ddd85������ x2 = new ddd85������("a2", 22);
        ddd85������ x3 = new ddd85������("a3", 33);
        ddd85������ x4 = new ddd85������("a4", 44);
        ddd85������ x5 = new ddd85������("d5", 44);
        ddd85������ x6 = new ddd85������("d5", 44);
        // ¼����ͬ��Ԫ�أ���֤��Ԫ�ص�Ψһ��
        x.add(x2);
        x.add(x1);
        x.add(x4);
        x.add(x3);
        x.add(x5);
        x.add(x6);
        for (ddd85������ i : x) {
            System.out.println(i.getName() + "," + i.getAge());
        }
        // 111
    }
}
