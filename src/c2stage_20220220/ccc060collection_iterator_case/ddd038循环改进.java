package c2stage_20220220.ccc060collection_iterator_case;
// ʹ�õ�������ѭ�����ռ��������Ϣ��Ȼ�󴢴浽������
// ����������Ϣ�Ժ󣬽������е���Ϣȫ����������


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ddd038ѭ���Ľ� {
    public static void main(String[] args) {
        Collection<ddd036student> x = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("�������" + (i + 1) + "λ��Ϣ��");
            ddd036student x2 = showdemo();// ֱ�ӵ��÷�����������
            x.add(x2);
        }
        Iterator<ddd036student> xx = x.iterator();
        while (xx.hasNext()) {
            ddd036student x5 = xx.next();
            System.out.println(x5.getName() + "," + x5.getAge());// ������Ҳ����ֱ����ʽ��̣���Ϊ���صľ��Ƕ��󣬶������getset����ֱ��չʾ���
        }
    }

    public static ddd036student showdemo() {
        Scanner x1 = new Scanner(System.in);
        System.out.println("name:");
        String x2 = x1.nextLine();
        System.out.println("age:");
        int x3 = x1.nextInt();
        ddd036student x4 = new ddd036student(x2, x3);
        return x4;
    }
}
