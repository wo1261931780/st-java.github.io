package abc����ѧϰ2021��10��2��.bbb046��ʼ��β;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb048������ {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        System.out.println("������������");
        String z1 = zz.nextLine();
        System.out.println("���������䣺");
        int z2 = zz.nextInt();
        ArrayList<bbb047��> xx = new ArrayList<>();
        bbb047�� x1 = new bbb047��("name", 11);
        //��ǰ�������ˣ���Ϊx1����һ������ֻ��һ�������ı���
        xx.add(x1);
        bbb047�� x2 = new bbb047��(z1, z2);
        xx.add(x2);
        bbb047�� x3 = new bbb047��(z1, z2);
        xx.add(x3);
        System.out.println("��ʼ����������");
        for (int s = 0; s < xx.size(); s++) {
            bbb047�� z = xx.get(s);
            System.out.println(z.getName() + z.getAge());
        }

        // ArrayList<String> zq=new ArrayList<>();
        // Scanner xx=new Scanner(System.in);
        // System.out.println("�뿪ʼ����������");
        // String name=xx.nextLine();
        // System.out.println("�뿪ʼ�������䣺");
        // int age=xx.nextInt();
        // zq.add(name+age);
        // zq.add(name+age);
        // zq.add(name+age);
        // System.out.println(zq);
        // for (int x=0;x<zq.size();x++){
        //     String s=zq.get(x);
        //     System.out.println(s);
        // }���涼���Ѿ���ɵķ���
    }
}
