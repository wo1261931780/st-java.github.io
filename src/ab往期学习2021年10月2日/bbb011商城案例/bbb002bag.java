package ab����ѧϰ2021��10��2��.bbb011�̳ǰ���;

import java.util.Scanner;

public class bbb002bag {
    public static void main(String[] args) {
        bbb001��Ʒ��[] x = new bbb001��Ʒ��[100];
        while (true) {
            int i = Interface_root();
            switch (i) {
                case 1:
                    add(x);
                    break;
                case 2:
                    del(x);
                    break;
                case 3:
                    change(x);
                    break;
                case 4:
                    show(x);
                    settlement(x);
                    cls_all(x);
                    break;
                case 5:
                    cls_all(x);
                    break;
                default:
                    show(x);
                    System.out.println("����������");
                    System.out.println("*****************************");
            }
        }
    }
// ����Ҳ���Խ�����������main��
// ���������ڲ����ֵ�scanner��ָ�ֱ�ӿ��Դ��ݸ������ķ���

    public static int Interface_root() {
        Scanner x = new Scanner(System.in);
        System.out.println("��ӭ����");
        System.out.println("1--�����Ʒ");
        System.out.println("2--ɾ����Ʒ");
        System.out.println("3--�޸���Ʒ��Ϣ");
        System.out.println("4--ȫ������");
        System.out.println("5--��չ��ﳵ");
        System.out.println("--�������Ӧָ��--");
        int command = x.nextInt();
        System.out.println("*****************************");
        return command;
    }

    public static void add(bbb001��Ʒ��[] s) {
        Scanner goods = new Scanner(System.in);
        System.out.println("��������Ʒ���ƣ�");
        String addname = goods.nextLine();
        System.out.println("��������Ʒ�۸�");
        int addprice = goods.nextInt();
        System.out.println("��������Ʒ������");
        int addnum = goods.nextInt();
        System.out.println("��������Ʒid��");
        int addid = goods.nextInt();
        bbb001��Ʒ�� x = new bbb001��Ʒ��(addname, addprice, addnum, addid);
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = x;
                System.out.println("������");
                return;
            }
        }
    }

    public static void del(bbb001��Ʒ��[] s) {
        Scanner x = new Scanner(System.in);
        String delname = x.nextLine();
        for (int i = 0; i < s.length; i++) {
            if (s[i].name.equals(delname)) {
                s[i] = null;
                System.out.println("ɾ���ɹ�");
                return;
            }
        }
        System.out.println("û�и���Ʒ������������");
    }

    public static void change(bbb001��Ʒ��[] s) {
        Scanner x = new Scanner(System.in);
        int chid = x.nextInt();
        for (int i = 0; i < s.length; i++) {
            if (s[i].id == chid) {
                System.out.println("������name��");
                s[i].name = x.nextLine();
                System.out.println("������price��");
                s[i].price = x.nextInt();
                System.out.println("������num��");
                s[i].num = x.nextInt();
                return;
            }
        }
        System.out.println("û�и���Ʒ������������");
    }

    public static void settlement(bbb001��Ʒ��[] s) {
        int tol = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                break;
            } else {
                tol += s[i].price * s[i].num;
            }
        }
        System.out.println("�ܼ۸��ǣ�" + tol);
    }

    public static void cls_all(bbb001��Ʒ��[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = null;
        }
        System.out.println("������");
    }

    public static void show(bbb001��Ʒ��[] s) {
        System.out.println("id��" + "\t" + "����" + "\t" + "�۸�" + "\t" + "����");
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                System.out.println("��ѯ����");
                return;
            } else {
                System.out.println(s[i].id + "\t\t" + s[i].name + "\t" + s[i].price + "\t" + s[i].num);
            }
        }
        // System.out.println("������");
    }


}
