package ab����ѧϰ2021��10��2��.bbb028Stringuild���;

import java.util.Scanner;

public class bbb035�ַ�����תplus {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x2 = xx.nextLine();
        String z = fz(x2);
        //���ս��һ��Ҫ�У���Ȼ�޷�ִ�к����sout��䡣
        System.out.println(z);
    }

    public static String fz(String x) {
        //        StringBuilder x1=new StringBuilder(x);
        //        x1.reverse();
        //        x=x1.toString();
        //        return x;
        //�����Ǻ���ʽ���
        return new StringBuilder(x).reverse().toString();
        // ������new StringBuilder(x)��ʵҲ������һ������
        // ��Ϊ����û�����֣����Գ�Ϊ��������
        // ͬʱ����ʹ����������Ҳ���Զ���ʹ�÷���
        // Ϊʲôһ��Ҫ��stringbuilderת��Ϊstring���ͣ�2021��9��18��15:42:21

    }
}
