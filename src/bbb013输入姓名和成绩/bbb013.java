package bbb013���������ͳɼ�;

import java.util.Scanner;

public class bbb013 {
    Scanner xx = new Scanner(System.in);
    /**
     * String name;
     * int age;
     */
    private int name;
    /**
     * private��ǰ׺���趨��������ֱ�ӷ��ʡ�
     */
    private int age;

    public void setName(int x1) {
        System.out.println("���������ƣ�");
        x1 = xx.nextInt();
        name = x1;
    }

    public void setAge(int a) {//�����set�ǹ̶����䣬���Զ���ʾǰ��ı���
        if (a < 0 || a > 120) {
            System.out.println("�������ݣ�����������");
        } else {
            age = a;
        }
    }

    public void show() {
        System.out.println(name + "�ĳɼ���:" + age);
    }
}
