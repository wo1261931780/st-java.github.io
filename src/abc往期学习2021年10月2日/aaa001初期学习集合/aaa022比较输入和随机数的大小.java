package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;
import java.util.Random;

public class aaa022�Ƚ������������Ĵ�С {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        Random b22 = new Random();
        System.out.println("���������ݣ�");
        int xx = b11.nextInt();
        int zz = b22.nextInt(1000);
        //һ����һ�����������շ����Ľ������Ȼ����������
        System.out.println("���ֵ�ǣ�" + max(xx, zz));


        /*��һ�δ���---------------------------------------
        //boolean zz=jo(xx);//�����Ľ���
        if(zz){
            System.out.println("������ż��");
        }else{
            System.out.println("���ݲ���ż��");
        }*/
        //������main��������β------------------------------
    }

    /**
     * �ڶ��δ���---------------------------------------
     * public static boolean jo(int xx) {
     * if(xx%2 ==0){
     * System.out.println("����"+xx+"��ż��");
     * return true;
     * //return֮���ܼ������룬��break�Ĺ��ܣ������д���Ҳ������ʾ��
     * }else{
     * System.out.println("����"+xx+"������");
     * return false;
     * }
     * }
     */
    public static double max(double xx, double zz) {
        if (xx > zz) {
            System.out.println("�����е����ֵ�ǣ�" + xx);
            return xx;
        } else {
            System.out.println("�����е����ֵ�ǣ�" + zz);
            return zz;
        }
    }


}
