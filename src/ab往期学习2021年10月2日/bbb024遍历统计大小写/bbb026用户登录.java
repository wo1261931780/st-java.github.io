package ab����ѧϰ2021��10��2��.bbb024����ͳ�ƴ�Сд;

import java.util.Scanner;
//���ܣ�ģ���½���Σ����δ���֮��ϵͳ�˳�

public class bbb026�û���¼ {
    public static void main(String[] args) {
        String x1 = "1";
        String x2 = "2";
        Scanner xx = new Scanner(System.in);
        //������new����һ���µĵ�ַ�����Բŵ��º���ĵ�ַ�Ƚ�
        for (int x0 = 0; x0 < 4; x0++) {
            System.out.println("�������û�����");
            String x3 = xx.nextLine();
            System.out.println("���������룺");
            String x4 = xx.nextLine();

            if (x3.equals(x1) && x4.equals(x2)) {
                System.out.println("��ӭ��¼����");
                System.out.println("�������");
                break;
            }else if (x0==3){
                System.out.println("����ľ����������");
            } else if (x3.equals(x1) == false || x4.equals(x2) == false) {
                System.out.println("�û�/����error,����������,����" + (3 - x0) + "�λ���");
            }
        }
        /*
        String x1 = "1";
        //������ֱ�Ӹ�ֵ��x1��x2ʹ����ͬ�ĵ�ַ
        String x2 = "2";
        Scanner xx = new Scanner(System.in);
        //������new����һ���µĵ�ַ�����Բŵ��º���ĵ�ַ�Ƚ�
        for (int x0 = 0; x0 < 4; x0++) {

            System.out.println("�������û�����");
            String x3 = xx.nextLine();
//            int x3=xx.nextInt();
            //����x3��x4�Ķ��ǵ�ַ�Ƚϣ���Ҫ�������ݱȽϡ�
            System.out.println("���������룺");
            String x4 = xx.nextLine();
//            int x4 = xx.nextInt();
            System.out.println(x3+"--"+x4);

            if (x3 == x1 || x4 == x2) {
                System.out.println("��ӭ��¼����");
                System.out.println("�������");
                break;
            } else if (x3 != x1) {
                System.out.println("�û�error,����������,����" + (3 - x0) + "�λ���");
            } else if (x4 != x2) {
                System.out.println("����error,����������,����" + (3 - x0) + "�λ���");
            }
        }
        System.out.println("ȫ��error,�������");*/
    }
}
