package c2stage_20220213.ccc052arrays;

public class ccc004����ƴ�Ӱ��� {
    public static void main(String[] args) {
        System.out.println("���ǲ�����");
        // int[] xx = {1, 32, 165, 4, 15, 156, 4, 46, 4};
        int[] xx = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0, temp = 0; i < (xx.length - 1); i++) {
            // ֻ����һ�ε�����£�ֻ�Ὣiλ�����ݺ�ǰ�����ݶԱȣ�����������ǰƽ��
            // ����ֻ�ܵõ�[8,7,6,5,4,3,2,1,9]
            // ��9�ᵽ�������������˳�򲻱�
            for (int x = 0; x < xx.length - 1 - i; x++) {
                // ����ÿ�α�������Ҫ��������ֶ������һλ
                // ��һ�����򣬽��Ϊ��[8,7,6,5,4,3,2,1,9]
                // �ڶ������򣬽��Ϊ��[7,6,5,4,3,2,1,8,9]
                // �����Դ�����
                // ��i��������Ҫ��������ݳ���Ϊ��xx.length-1-i��
                if (xx[x] < xx[x + 1]) {
                } else {
                    temp = xx[x + 1];
                    xx[x + 1] = xx[x];
                    xx[x] = temp;
                    System.out.println(sortsm(xx));
                }
            }
            System.out.println("---");
            // 2021��10��2��10:31:56
            // ���ǹ��ϲ�ѭ��������Ƕ�׵�ѭ�����ϲ�����ֻ�������
        }
        System.out.println(sortsm(xx));
        // System.out.println(xx.toString());

    }

    // ����ƴ��ģ��
    public static String sortsm(int[] x) {
        StringBuilder x1 = new StringBuilder();
        x1.append("[");
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x1.append(x[i]);
            } else {
                x1.append(x[i]).append(",");
            }
        }
        x1.append("]");
        return x1.toString();
    }
}
