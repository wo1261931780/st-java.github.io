package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;

public class aaa002��Ԫ�����2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        //����ab
        //ȡֵ���.
        int dy = a > b ? a : b;
        System.out.println("dy:" + dy);
        System.out.println("------------");

        //�Ƿ���ȡ�
        int eq = a == b ? a : b;
        System.out.println("same:" + eq);
        System.out.println("------------");

        //�Ƿ�С�ڡ�
        int xy = a < b ? a : b;

        System.out.println("smaller:" + xy);
        //��Ԫ������ĺ����ǣ�
        //int xy = a < b ? a : b;
        //�ж�(a<b)���ʽ�ӵ�true/false�������true������(a:b)��ߵ�a����������ұߵ�b
        // 2021��9��6��09:34:16
        // demotest��2021��9��6��09:36:50
        show();

        System.out.println("end");

    }


    public static void show(){
        System.out.println("my method");
        Random x=new Random();
        int i = x.nextInt(200);
        int i1 = i > 100 ? 11 : 22;
        System.out.println(i1);
        System.out.println("end");
    }
}
