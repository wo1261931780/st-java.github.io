package c2stage_20220203.ccc048period;

import java.time.LocalDate;
import java.time.Period;

public class ccc001period {
    public static void main(String[] args) {
        LocalDate x = LocalDate.now();//���Ȼ�ȡһ����ǰ��ʱ��
        System.out.println("�����" + x);
        LocalDate bd = LocalDate.of(1996, 11, 22);//Ȼ������һ��ָ��ʱ��
        System.out.println("���գ�" + bd);
        Period xx = Period.between(bd, x);//�ڶ���������ȥ��һ������
        //period��ȡ����ʱ��Ĳ�ֵ
        System.out.println("�꣺" + xx.getYears());
        // �꣺25
        System.out.println("�£�" + xx.getMonths());
        // �£�2
        System.out.println("�գ�" + xx.getDays());
        // �գ�15
        // *********************************************************
        System.out.printf("�Զ���ʱ�䣺%d��%d��%d��", xx.getYears(), xx.getMonths(), xx.getDays());

    }
}
