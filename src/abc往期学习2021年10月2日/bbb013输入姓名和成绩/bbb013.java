package abc����ѧϰ2021��10��2��.bbb013���������ͳɼ�;
// ��Ա�����;ֲ�����

import java.util.Scanner;

public class bbb013 {
    Scanner xx = new Scanner(System.in);
    int ss = 0;
    // ss����013��������У�show��������ı�����һ���Ϊ��Ա����
    // ��Ա�����ڶ��ڴ��У�
    // ����setname�ж����x1�����ڷ����еı�����Ҳ�����ֲ�����
    // �ֲ�������ջ�ڴ���


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

    //�����set�ǹ̶����䣬���Զ���ʾǰ��ı���
    public void setAge(int a) {
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
