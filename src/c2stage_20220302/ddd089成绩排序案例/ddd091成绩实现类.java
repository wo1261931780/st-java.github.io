package c2stage_20220302.ddd089�ɼ�������;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ddd091�ɼ�ʵ���� {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        TreeSet<ddd090������> x = new TreeSet<>(new Comparator<ddd090������>() {
            @Override
            public int compare(ddd090������ o1, ddd090������ o2) {
                int num = o1.getTotalscore() - o2.getTotalscore();
                // System.out.println(o1.getName().compareTo(o2.getName()));
                // ����һ����Ԫ�������
                // 1.�ж�num�Ƿ�Ϊ0��Ҳ���Ƿ����Ƿ���ͬ
                // ��ͬ������£����Ϊtrue��ִ��o1.getName().compareTo(o2.getName())
                // 2.o1.getName().compareTo(o2.getName())�ж������Ƿ���ͬ
                // ��ͬ�򷵻�0�����򷵻��������ݣ��������ݾͱ�ʾ����ӵ�������
                // 3.�����������ͬ����ֱ�ӷ��ض��ߵķ�����ֵnum��Ȼ��ֱ����Ӷ���
                int num2 = num == 0 ? o1.getYwscore() - o2.getYwscore() : num;
                int num3 = num == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                // �����ѡ������ǣ�
                // 1.�ȿ��ܳɼ��Ƿ���ͬ��
                // 2.�����ĳɼ��Ƿ���ͬ��ȥ����ͬ�ɼ�
                // 3.�������Ƿ���ͬ��ȥ����ͬ��Ա
                return num3;
                // int compareTo(T o)
                // ���˶�����ָ���Ķ�����бȽ��Խ������� ����һ�����������������������Ϊ�ö���С�ڣ����ڻ����ָ������
            }
            // ʹ�ñȽ������򣬾���Ҫ�Ƚ����ӿڵ�ʵ�������
        });
        ddd090������ x1 = addst();
        ddd090������ x2 = addst();
        ddd090������ x3 = addst();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (ddd090������ i : x) {
            System.out.println("ͬѧ��" + i.getName() + ",�ܳɼ�Ϊ��" + i.getTotalscore() + "�����ĳɼ���" + i.getYwscore() + "����ѧ�ɼ���" + i.getMathscore());
        }
        // ddd090������ x1 = new ddd090������("a1", 98, 99, 197);
    }

    public static ddd090������ addst() {
        Scanner x = new Scanner(System.in);
        ddd090������ x1 = new ddd090������();
        System.out.println("����������");
        String x2 = x.nextLine();
        x1.setName(x2);
        System.out.println("���������ĳɼ�");
        int x3 = x.nextInt();
        x1.setYwscore(x3);
        System.out.println("��������ѧ�ɼ�");
        int x4 = x.nextInt();
        x1.setMathscore(x4);
        x1.setTotalscore(x1.getYwscore() + x1.getMathscore());
        return x1;
    }
}
