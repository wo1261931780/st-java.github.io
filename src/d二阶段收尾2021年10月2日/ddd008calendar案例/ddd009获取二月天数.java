package d���׶���β2021��10��2��.ddd008calendar����;
/*
    ����
        ��ȡ����һ��Ķ����ж�����

    ˼·��
        1:����¼����������
        2:��������������ꡢ�¡���
            �꣺�����ڼ���¼��
            �£�����Ϊ3�£��·��Ǵ�0��ʼ�ģ��������õ�ֵ��2
            �գ�����Ϊ1��
        3:3��1����ǰ��һ�죬����2�µ����һ��
        4:��ȡ��һ���������
 */

import java.util.Calendar;
import java.util.Scanner;

public class ddd009��ȡ�������� {
    public static void main(String[] args) {
        Calendar x = Calendar.getInstance();
        Scanner x1 = new Scanner(System.in);
        System.out.println("���������ʱ�䣺");
        int x2 = x1.nextInt();
        x.set(x2, 2, 1);
        // ���þ���������
        // �·��Ǵ�0��ʼ����ģ���������3��ʵ������2��
        // ͬʱ����������Ϊ1����ô�ͻ�õ�3.1�ĳ�ʼʱ��
        // x.get(Calendar.DAY_OF_MONTH);
        x.add(Calendar.DATE, -1);
        // ���趨�ó�ʼʱ���Ժ󣬶����ڽ�����������
        // ���յõ���ʱ�䣬��3.1����ǰһ�죬Ҳ�͵õ����·ݵ���������
        int mm = x.get(Calendar.MONTH) + 1;
        // �����һ����Ϊ�˷���չʾ
        int dd = x.get(Calendar.DATE);
        // int mm = x.get(Calendar.MONTH);
        // int dd = x.get(Calendar.DATE) - 5;
        // �����get������������չʾȫ���ǻ������ֵ�
        // ���Ի���ֺ�ʵ�������ƥ�������ʱ��
        // �������趨3.1����չʾ��ʱ�������-5�����յõ�3.-4

        System.out.println(mm + "," + dd);

    }
}
