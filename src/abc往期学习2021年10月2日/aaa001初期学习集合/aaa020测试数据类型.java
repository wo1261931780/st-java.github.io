package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;
import java.util.Random;

public class aaa020������������ {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        Random zz = new Random();
        System.out.println("���������֣�");
        int x1 = xx.nextInt();
        int z1 = zz.nextInt(1000);
        jo(z1);    //������÷����õ������ݣ���Ϊ�β��Ѿ�ת����˫���㣬������С����
        System.out.println("����������ǣ�" + x1 + ";����õ���������:" + z1);    //����ֱ�ӻ�ȡ��������������õ��ģ�������int����
    }

    public static void jo(double z1) {
        if (z1 % 2 == 0) {
            System.out.println("��������������ǣ�" + z1);
        } else {
            System.out.println("��������������ǣ�" + z1);
        }
    }
}
