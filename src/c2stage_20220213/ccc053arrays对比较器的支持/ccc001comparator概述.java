package c2stage_20220213.ccc053arrays�ԱȽ�����֧��;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc052arrays
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-08  ���ڶ�
 */
public class ccc001comparator���� {
    public static void main(String[] args) {
        int[] x = {1, 21, 3, 156, 4, 64, 874, 8, 7};// Ĭ��ʹ��int�������ͣ����Խ�����������
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        // *************************************
        Integer[] x1 = {54, 123, 54, 65, 46, 8, 7, 987, 9, 78};//����Ƕ������ͣ�����Ҫָ���Ƚ����ͱȽϹ���
        Arrays.sort(x1, new Comparator<Integer>() {//��Ҫ��������飬�������
            // �����ڲ���
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        ccc002������[] x2 = new ccc002������[5];
        x2[0] = new ccc002������("��1", 33, "����1");
        x2[1] = new ccc002������("��2", 21, "����2");
        x2[2] = new ccc002������("��3", 12, "����3");
        x2[3] = new ccc002������("��4", 1, "����4");
        x2[4] = new ccc002������("��5", 5, "����5");
        System.out.println(Arrays.toString(x2));
        // ************************************
        Arrays.sort(x2, new Comparator<ccc002������>() {
            @Override
            public int compare(ccc002������ s1, ccc002������ s2) {
                return s1.getAge() - s2.getAge();
                // ������治����������double���͵�
                //ʹ��Double.compare(x1.getAge(),x2.getAge())�Ϳ�����ɱȽ�
                //����ֱ�ӷ��ضԱȵĽ��
            }
        });
        System.out.println(Arrays.toString(x2));

    }
}
