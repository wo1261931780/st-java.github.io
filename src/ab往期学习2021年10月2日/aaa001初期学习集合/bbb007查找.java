package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class bbb007���� {
    public static void main(String[] args) {
        int[] zz = {32456, 23, 1, 4, 56, 4, 178, 13, 54, 15, 2, 1};
        Scanner b11 = new Scanner(System.in);
        System.out.println("�������ݣ�");
        int z1 = b11.nextInt();
        System.out.println("���鳤��Ϊ��" + zz.length);
        System.out.println("��ʼ��������------------");
        int z = 0;
        int z0 = -1;
        for (System.out.println("���������"); z < zz.length; z++) {
            if (z1 == zz[z]) {
                z0 = z;
                break;
            }
        }
        System.out.println("��������Ϊ��" + z0);
        // �����������ַ���ȥ��ѯ
        // һ����ʹ��main�����ڵı�����һ���Ƿ�װ�ɷ���ֱ�ӵ���
        int qq = db(zz, z1);
        System.out.println("�����õ��������ǵ�" + qq + "λ");
        /*
        boolean xx = db(zz,z1);
        if (xx == false) {
            System.out.println("����-1");
        } else {
        }
        */
    }
    /*
    public static boolean db(int[] zz,int z1) {
        //����01��1�ĺ�����ͬ�����Ʋ�ͬ��
        //��ͬ���ݣ����Ȳ��ҿ�ǰ�ġ�
        System.out.println("��ʼ��������------------");
        for (int x = 0; x < zz.length; x++) {
            if (z1 == zz[x]) {
                System.out.println("�����ǵ�" + x + "λ");
                return true;
                //break;
                //�����������ͣ��Ӧ�û��ζԱȣ���Ϊ���������ݿ����ظ�.
            } else {
            }
        }��һ�ζ�̫������
        return false;
    */

    public static int db(int[] zz, int z1) {
        int x = 0;
        for (System.out.println("������ʼ��������------------"); x < zz.length; x++) {
            if (z1 == zz[x]) {
                return x;
                // break;
                //��������ĳ�����12������0λ���֣����11λ���޷��жϣ������϶�������
            } else if (x == 11) {
                System.out.println("���ֲ�����������");
                //����ֵ-1��ʾ����������
                return x = -1;
            } else {
                // System.out.println("��������");
                // x = -1;
                // break;
            }
        }
        return x;
    }
}
