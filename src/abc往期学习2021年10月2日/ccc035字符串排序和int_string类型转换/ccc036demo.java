package abc����ѧϰ2021��10��2��.ccc035�ַ��������int_string����ת��;

import java.util.Arrays;

public class ccc036demo {
    public static void main(String[] args) {
        System.out.println("-----------------");
        String x = "1 354 15 5 46 854 8 546";
        String[] x1 = x.split(" ");
        //����һ��string������x1��x1��Ԫ��������x���ÿո�ֿ���
        int[] x2 = new int[x1.length];
        //����int���͵�����x2��������x1�ĳ���
        for (int i = 0; i < x2.length; i++) {
            x2[i] = Integer.parseInt(x1[i]);
            //����parse��������String��ʽ��x1ת����int���͵�x2
            //ͬʱ�Ѷ�ӦԪ�ش����ȥ
        }

        for (int i = 0; i < x2.length; i++) {
            System.out.print(x2[i] + "---");
        }
        Arrays.sort(x2);
        //ֱ�Ӷ�x2����������
        StringBuilder xx = new StringBuilder();
        //����StringBuildƴ��
        System.out.println("start");
        for (int i = 0; i < x2.length; i++) {
            if (i == x2.length - 1) {
                xx.append(x2[i]);
            } else {
                xx.append(x2[i] + "-");
            }
        }
        System.out.println(xx);
        String xx1 = xx.toString();
        //��ʵ��Щת��������������ڣ�����һЩString�����޷����õķ���
        System.out.println("123:" + xx1);

    }
}
