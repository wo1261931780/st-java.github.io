package c2stage_20220202.ccc039object_api_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ccc001 {
    public static void main(String[] args) {
        double x = 0.1;
        double x1 = 0.2;
        BigDecimal x2 = BigDecimal.valueOf(x);
        BigDecimal x3 = BigDecimal.valueOf(x1);
        BigDecimal x4 = x2.multiply(x3);//�Ӽ��˳�ֱ��ʹ�ü���
        // ��Ϊbigdecimal�������һ��������������ڲ����������㷽��
        System.out.println("����x4��" + x4);
        double x5 = x4.doubleValue();//���Ǽ�����̣���֤��ȷ���Ժ󣬻���Ҫ����double���ʹ�������
        System.out.println("����x5��" + x5);
        System.out.println("***********************************************");
        BigDecimal a1 = new BigDecimal(20);
        BigDecimal a2 = new BigDecimal(3);
        // BigDecimal a3 = a1.divide(a2);//ʽ��20/3=6.6666����Զ�޷�������ֱ�ӵõ��ᱨ��

        /**
         ����һ������ ������������С��λ��  ������������ģʽ
         */
        BigDecimal a3 = a1.divide(a2,2, RoundingMode.HALF_UP);//����һ������С������������
        //**********************a1��a2������2λС�����������������
        System.out.println(a3);//����20/3=6.67���൱����������
    }
}
