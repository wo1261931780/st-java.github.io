package c2stage_20220228.ccc080hash_case2;

import java.util.HashSet;

public class ddd078hashset�洢ѧ���������� {
    public static void main(String[] args) {
        HashSet<ddd077������> x = new HashSet<>();
        ddd077������ x1 = new ddd077������("n1", 11);
        ddd077������ x2 = new ddd077������("n2", 22);
        ddd077������ x3 = new ddd077������("n3", 33);
        ddd077������ x4 = new ddd077������("n4", 44);
        ddd077������ x5 = new ddd077������("n4", 44);
        // �ڲ���д����������£�
        // ֱ����ӻᵼ������ظ�����
        // hashset�ĵײ㷽����hashcode��equals��
        // ������д���Խ����������������ڣ��������name��age�ظ��Ķ���
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        x.add(x5);
        for (ddd077������ i : x) {
            System.out.println(i.getName() + "--" + i.getAge());
        }
    }
}
