package ab����ѧϰ2021��10��2��.bbb056ѧ������ϵͳ2021;


import java.util.ArrayList;
import java.util.Scanner;

public class bbb058ѧ�������� {
    public static void main(String[] args) {
        // while (true){};
        // ����ֱ����whileѭ���Ľ����ݶ�Ϊ��ѭ����ֱ��ѡ��������
        // System.out.println("--------------");
        // Scanner x = new Scanner(System.in);
        // int x1 = x.nextInt();
        // def();
        ArrayList<bbb057ѧ����> xx1 = new ArrayList<>();
        // switch (def()) {
        //     case 1:
        //         adds(xx1);
        //         def();
        //         break;
        //     case 2:
        //         del(xx1);
        //         def();
        //         break;
        //     case 3:
        //         changeme(xx1);
        //         def();
        //         break;
        //     case 4:
        //         showme(xx1);
        //         def();
        //         break;
        //     case 5:
        //         quits();
        //         break;
        //     default:
        //         def();
        // }
        for (int i = 1; i > 0 && i < 5; ) {
            // def();
            // System.out.println("***");
            i = def();
            if (i == 1) {
                adds(xx1);
            } else if (i == 2) {
                del(xx1);
            } else if (i == 3) {
                changeme(xx1);
            } else if (i == 4) {
                showme(xx1);
            } else if (i == 5) {
                // quits();
                System.exit(0);
                // ������jvm������˳�����
            } else {
            }
        }
        System.out.println("�������");
    }

    // �������
    public static int def() {
        System.out.println("-----------------��ӭ����ѧ������ϵͳ-----------------");
        System.out.println("1.���ѧ��");
        System.out.println("2.ɾ��ѧ��");
        System.out.println("3.�޸�ѧ��");
        System.out.println("4.�鿴����ѧ��");
        System.out.println("5.�˳�");
        System.out.println("���������ѡ��");
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        if (x1 < 0 || x1 > 6) {
            System.out.println("������룬�����˳�");
        }
        return x1;
    }

    /**
     * ��ӷ���
     * ����¼��ѧ����������Ҫ������,��ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
     * Ϊ����sid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ����
     * Ϊ���ó����ܹ��ص��������ʹ��ѭ��ʵ��
     * ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
     * ��ѧ��������ӵ�������
     * ������ӳɹ���ʾ
     */
    // public static void adds(ArrayList<bbb057ѧ����> xx1) {
    public static void adds(ArrayList<bbb057ѧ����> xx1) {
        Scanner x0 = new Scanner(System.in);
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        Scanner x3 = new Scanner(System.in);
        bbb057ѧ���� a1 = new bbb057ѧ����();
        System.out.println("������ѧ�ţ�");
        int nun = x0.nextInt();
        //-----------------------------
        // �����ڵĿ�����ȡ��������Ϊһ��������װ
        int demo = 0;
        // �̳���ʹ�õķ�������Ҫ�ڽ���ظ�������£���������ѧ�Ź���
        for (int i = 0; i < xx1.size(); i++) {
            if (xx1.get(i).getNun() == nun) {
                System.out.println("ѧ���Ѵ��ڣ�����������");
                demo = 1;
                break;
            }
        }
        if (demo == 1) {
        } else {
            //-----------------------------
            a1.setNun(nun);
            System.out.println("������������");
            String xname = x1.nextLine();
            a1.setName(xname);
            System.out.println("���������䣺");
            int xage = x2.nextInt();
            a1.setAge(xage);
            System.out.println("�������ס�أ�");
            String xcity = x3.nextLine();
            a1.setCity(xcity);
            xx1.add(a1);
            System.out.println("��ӽ���------------------");
        }
    }

    // ɾ������
    public static void del(ArrayList<bbb057ѧ����> xx1) {
        Scanner x = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ�");
        int x1 = x.nextInt();
        // �ж��Ƿ��ҵ���Ӧ�˺ţ��ҵ�������=1����������Ϊ0
        int u = 0;
        for (int i = 0; i < xx1.size(); i++) {
            bbb057ѧ���� x2 = xx1.get(i);
            if (x1 == x2.getNun()) {
                xx1.remove(i);
                System.out.println("�ҵ��˺ţ�ִ��ɾ������");
                u = 1;
                break;
            }
        }
        if (u == 0) {
            System.out.println("ɾ��ʧ�ܣ�δ�ҵ�ѧ��");
        } else {
            System.out.println("ɾ���ɹ�");
        }

    }

    // �޸ķ���
    public static void changeme(ArrayList<bbb057ѧ����> xx1) {
        Scanner xx0 = new Scanner(System.in);
        Scanner xx2 = new Scanner(System.in);
        Scanner xx3 = new Scanner(System.in);
        Scanner xx4 = new Scanner(System.in);
        // ������ʵ����ֻ��һ���������int����ȫ��ʹ��textline����
        System.out.println("������ѧ�ţ�");
        int x1 = xx0.nextInt();
        for (int i = 0; i < xx1.size(); i++) {
            if (x1 == xx1.get(i).getNun()) {
                // ��������Ƚ��ս����Ȼ��ʹ��equals����ȥ�жϺ�x1�Ƿ����
                System.out.println("��������������");
                String x2 = xx2.nextLine();
                xx1.get(i).setName(x2);
                System.out.println("��������������");
                int x3 = xx3.nextInt();
                xx1.get(i).setAge(x3);
                System.out.println("�����������ס��");
                String x4 = xx4.nextLine();
                xx1.get(i).setCity(x4);
                System.out.println("�޸ĳɹ�,�ص���ҳ");
                // �ҵ���ֱ���˳�������Ҫ��������
                break;
            }
        }
        System.out.println("��������");
    }

    // �鿴����ѧ��
    public static void showme(ArrayList<bbb057ѧ����> xx1) {
        System.out.println("ִ�м��ϱ���");
        if (xx1.size() == 0) {
            System.out.println("����Ϣ������ִ����Ӳ���");
            // return;
            // ����return������Ͳ�������ִ��
        } else {
            System.out.println("ѧ��\t" + "����\t" + "����\t" + "��ס��\t");
            for (int i = 0; i < xx1.size(); i++) {
                bbb057ѧ���� a = xx1.get(i);
                System.out.println(a.getNun() + "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getCity());
            }
        }
    }

    // public static void quits() {
    //     System.out.println("�˳�����--------");
    // }

}
